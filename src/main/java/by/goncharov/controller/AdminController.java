package by.goncharov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Admin Page Controller.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController
{
	/**
	 * Prints Welcome.
	 *
	 * @param model the mvc model
	 *
	 * @return the mvc model
	 */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView printWelcome(final ModelAndView model)
	{
		model.addObject("title", "Spring Security + Hibernate Example");
		model.addObject("message", "This is default page!");
		model.setViewName("secure/dashboard");

		return model;
	}
}
