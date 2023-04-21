package com.jp.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jp.car.dao.CarMantencDao;
import com.jp.car.model.CarMantenc;

@Controller
@RequestMapping(value="/controller")
public class MantencController {
	
	@Autowired
	private CarMantencDao cmd;
	@ModelAttribute
	private CarMantenc car() {
		return new CarMantenc();
	}
	
	@RequestMapping(value="/mantenc")
	public String getCarMantenc(Model model) {
		
		List<String> lis = this.cmd.getExpenList();
		model.addAttribute("List", lis);
		return "/mantenc/carMantencList";
	}
	
	@RequestMapping(value="/findExpendIt", method=RequestMethod.POST)
	public String findExpendItem(Model model, BindingResult br, CarMantenc cm) {
		return null;
	}
	
}
