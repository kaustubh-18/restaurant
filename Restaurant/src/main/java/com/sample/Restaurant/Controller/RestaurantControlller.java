package com.sample.Restaurant.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RestaurantControlller {

	@GetMapping("/welcome")
	public ModelAndView start()
	{
		return new ModelAndView("welcome");
	}
}
