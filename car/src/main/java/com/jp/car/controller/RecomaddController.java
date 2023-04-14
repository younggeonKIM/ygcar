package com.jp.car.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jp.car.dao.CarRecomDaoImpl;
import com.jp.car.model.CarRecom;
@Controller
public class RecomaddController {

	
	@RequestMapping(value="/controller/recomadd", method=RequestMethod.GET)
	public String toRecomAdd() {
		return "/recommend/carRecomAdd";
	}
	
	
	@RequestMapping(value="/controller/recomadd", method=RequestMethod.POST)
	public ModelAndView recomCarAdd(CarRecom cr) {
		ModelAndView mav = new ModelAndView();
		CarRecomDaoImpl recomDao = new CarRecomDaoImpl();
		recomDao.addCar(cr);
		mav.addObject("resMsg", recomDao.findAutoNam(cr));
		mav.setViewName("/recommend/carRecomAdd_Res");
		return mav;
	}
}
