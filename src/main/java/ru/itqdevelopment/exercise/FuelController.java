package ru.itqdevelopment.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application index page.
 */
@Controller
public class FuelController {
	
	private static final Logger logger = LoggerFactory.getLogger(FuelController.class);
	
	/**
	 * Simply selects the index view to render by returning its consumption.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView main(@ModelAttribute Calc calc) {
		return new ModelAndView("index", "consumption", new Calc());
	}

}
