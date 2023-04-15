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
	
	
	
	@RequestMapping(value="/controller/recom/orign")
	public String findCarMakrByOrig (String org, Model model) {
//		List<CarRecom>list = carrecomdao.findAutoList(org);
//		ModelAndView mav = new ModelAndView();
//		CarRecomDaoImpl recomDao = new CarRecomDaoImpl();
//		mav.addObject("carNameList", recomDao.findAutoList(org));
//		mav.setViewName("/recommend/RecomCarList");
		
//		model.addAttribute("carNameList", list);
		return "/recommend/RecomCarList";
	}
}
