package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping(value = "/demo")
	public ModelAndView getSample() {
		System.out.println("This is Demo app.....");
		return new ModelAndView("demo");
	}
}
