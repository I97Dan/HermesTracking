package pl.com.turski.hermes.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: Adam
 */
@Controller
public class MainController {

    private static final Logger LOG = Logger.getLogger(MainController.class);

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView homePage() {
        LOG.debug("Home page creation");
        return new ModelAndView("home");
    }
}
