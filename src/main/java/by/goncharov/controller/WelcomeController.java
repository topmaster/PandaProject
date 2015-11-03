package by.goncharov.controller;

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
public class WelcomeController {

    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public ModelAndView handleRequestInternal(ModelAndView model) throws Exception {
        model.setViewName("login");
        return model;
    }
}
