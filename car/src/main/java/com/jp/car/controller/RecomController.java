package com.jp.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RecomController {
	
	@RequestMapping(value="/controller/recom", method=RequestMethod.GET)
	public String recom(Model model) {
		
		
		return "/recommend/carRecom";
	}
	
	@RequestMapping(value="/controller/recom/dome")
	public String domesticRecom(Model model) {
		
		return "/recommend/domCarRecom";
	}
	
	@RequestMapping(value="/controller/recom/forgn")
	public String foreignRecom(Model model) {
		
		return "/recommend/forCarRecom";
	}
}
