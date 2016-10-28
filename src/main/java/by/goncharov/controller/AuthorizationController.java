package by.goncharov.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Authorization page Controller.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Controller
@RequestMapping(value = "/authorization")
public class AuthorizationController
{
	/**
	 * Login page.
	 *
	 * @param error   the error request param
	 * @param logout  the logout request param
	 * @param request the HttpServletRequest
	 *
	 * @return the mvc model
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) final String error,
	                          @RequestParam(value = "logout", required = false) final String logout,
	                          final HttpServletRequest request)
	{

		final ModelAndView model = new ModelAndView();
		if (error != null)
		{
			model.addObject("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
		}

		if (logout != null)
		{
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;
	}

	/**
	 * Access Denied.
	 *
	 * @return the mvc model
	 */
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accessDenied()
	{
		final ModelAndView model = new ModelAndView();
		final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken))
		{
			final UserDetails userDetail = (UserDetails) auth.getPrincipal();
			System.out.println(userDetail);
			model.addObject("username", userDetail.getUsername());
		}
		model.setViewName("403");
		return model;
	}

	/**
	 * Gets Error Message.
	 *
	 * @param request the HttpServletRequest
	 * @param key     the key
	 *
	 * @return the error
	 */
	private String getErrorMessage(final HttpServletRequest request, final String key)
	{
		final Exception exception = (Exception) request.getSession().getAttribute(key);

		String error;
		if (exception instanceof BadCredentialsException)
		{
			error = "Invalid username and password!";
		}
		else if (exception instanceof LockedException)
		{
			error = exception.getMessage();
		}
		else
		{
			error = "Invalid username and password!";
		}
		return error;
	}
}
