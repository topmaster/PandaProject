package by.goncharov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description of AdminController class
 *
 * @author Mikita Hancharou
 * @created 03.11.2015 23:28
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView printWelcome(ModelAndView model) {
        model.addObject("title", "Spring Security + Hibernate Example");
        model.addObject("message", "This is default page!");
        model.setViewName("secure/dashboard");

        return model;
    }
}
