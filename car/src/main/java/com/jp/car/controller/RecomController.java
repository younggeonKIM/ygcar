package com.jp.car.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jp.car.dao.CarRecomDaoImpl;
import com.jp.car.model.CarRecom;


@Controller
public class RecomController {
	
	
	@RequestMapping(value="/controller/recom", method=RequestMethod.GET)
	public String recom(Model model) {
		
		
		return "/recommend/carRecom";
	}
	
	
	
	@RequestMapping(value="/controller/recom/orign")
	public ModelAndView findCarMakrByOrig (String org) {
		ModelAndView mav = new ModelAndView();
		CarRecomDaoImpl recomDao = new CarRecomDaoImpl();
		mav.addObject("carNameList", recomDao.findAutoMakr(org));
		mav.setViewName("/recommend/RecomCarList");
		return mav;
	}
}
