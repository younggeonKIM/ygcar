package com.jp.car.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.jp.car.dao.CarRecomDaoImpl;
import com.jp.car.model.CarRecom;
@Controller
public class RecomAddController {

	
	
	@RequestMapping(value="/controller/RecomAdd", method=RequestMethod.POST)
	public String recomCarAdd(CarRecom cr) {
		CarRecomDaoImpl recomDao = new CarRecomDaoImpl();
		recomDao.addCar(cr);
		return "/recommend/RecomCarList";
	}
}
