package com.mypack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Calculator;

@Controller
public class CalcController {
	@RequestMapping("/CalcController")
public ModelAndView CalcController(@ModelAttribute Calculator c) {
	

		System.out.println(c.getAddition());
		return new ModelAndView("Display");
		



}
	
}
