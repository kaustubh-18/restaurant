package com.sample.Restaurant.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RestaurantControlller {

	@GetMapping("/welcome")
	public ModelAndView start()
	{
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        String role = auth.getAuthorities().toString();
	        System.out.println("Role is "+role);
	        if(role.equals("[ADMIN]"))
	        	return new ModelAndView("welcome");
	        
	        return new ModelAndView("restinfo");
	}
}
