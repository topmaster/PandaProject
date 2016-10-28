package by.goncharov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Welcome Page Controller.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Controller
public class WelcomeController
{
	/**
	 * Handles Request Internal.
	 *
	 * @param model the mvc model
	 *
	 * @return the mvc model
	 *
	 * @throws Exception the Exception
	 */
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public ModelAndView handleRequestInternal(final ModelAndView model) throws Exception
	{
		model.setViewName("login");
		return model;
	}
}
