package com.jp.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jp.car.dao.CarRecomDao;
import com.jp.car.dao.CarRecomDaoImpl;
import com.jp.car.model.CarRecom;


@Controller
public class RecomController {
	
	@Autowired
	CarRecomDao crd;
	
	@Autowired
	CarRecom cr;
	
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
	
	@RequestMapping(value="/controller/recom", method=RequestMethod.POST)
	public ModelAndView findCarInfo (CarRecom cr) {
		ModelAndView mav = new ModelAndView();
		CarRecomDaoImpl domDao = new CarRecomDaoImpl();
		mav.addObject("carNameList", domDao.getAutoNamByOrig(cr));
		mav.setViewName("/recommend/RecomCarList");
		return mav;
	}
}
