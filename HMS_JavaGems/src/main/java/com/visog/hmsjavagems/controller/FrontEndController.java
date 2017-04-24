package com.visog.hmsjavagems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Mubarak
 *
 */
@Controller
@RequestMapping("/")
public class FrontEndController {
	
	
	/*
	 * 
	 */
	@RequestMapping(value ="/index",method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("main/index");
	}
	

}
