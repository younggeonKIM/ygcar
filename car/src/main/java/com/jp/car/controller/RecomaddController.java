package com.jp.car.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jp.car.dao.CarRecomDao;
import com.jp.car.dao.CarRecomDaoImpl;
import com.jp.car.model.CarRecom;
@Controller
@RequestMapping(value="/controller")
public class RecomaddController {

	
	
	@Autowired
	private CarRecomDao crd;	
	
	@ModelAttribute
	public CarRecom car() { 
		return new CarRecom();
	}
	
	@RequestMapping(value="/recomadd", method=RequestMethod.GET)
	public String toRecomAdd(Model model) {
		CarRecom cr = new CarRecom();
		model.addAttribute("carRecom", cr);
		return "/recommend/carRecomAdd";
	}
	
	
	@RequestMapping(value="/recomadd/addexe", method=RequestMethod.POST)
	public String recomCarAdd(@ModelAttribute ("cr") CarRecom cr, BindingResult br, Model model) {
		if(br.hasErrors()) {
			return "error";
		}
		
		
		this.crd.addCar(cr);
		
		CarRecom acr = this.crd.findCarRecom(cr);
		
		model.addAttribute("addedCarRecom", acr);
		
		return "/recommend/carRecomAdd_Res";
	}
}
