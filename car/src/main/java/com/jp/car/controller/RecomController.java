package com.jp.car.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jp.car.dao.CarRecomDao;
import com.jp.car.model.CarRecom;
@Controller
public class RecomController {
	
	
	@Autowired
	private CarRecomDao crd;
	
	@RequestMapping(value="/controller/recom", method=RequestMethod.GET)
	public String recom(Model model) {
		
		
		return "/recommend/carRecom";
	}
	
	@RequestMapping(value="/controller/recom/orign")
	public String findCarMakrByOrig (String org, Model model) {

//		ModelAndView mav = new ModelAndView();
		List<CarRecom> crLis = this.crd.findAutoList(org);
//		mav.addObject("carNameList", recomDao.findAutoList(org));
//		mav.setViewName("/recommend/RecomCarList");
		
		model.addAttribute("carNameList", crLis);
		return "/recommend/RecomCarList";
	}
}
