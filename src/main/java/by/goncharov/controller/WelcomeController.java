package by.goncharov.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description of WelcomeController class
 *
 * @author Mikita Hancharou
 * @created 19.10.2015 1:47
 */
@Controller
@RequestMapping(value = "/admin")
public class WelcomeController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView printWelcome(ModelAndView model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addObject("title", "Spring Security + Hibernate Example");
        model.addObject("message", "This is default page!");
        model.setViewName("secure/hello");

        return model;
    }

}
