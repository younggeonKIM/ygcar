package jp.com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.com.board.model.UserLoginModel;

@Controller
@RequestMapping(value = "/controller")
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET )
	public String Login() {
		
		return "loginView";
	}
	
	@ModelAttribute
	public UserLoginModel setUpULM() {
		UserLoginModel ulm = new UserLoginModel();
		return ulm;
	}
	
	@RequestMapping(value="./loginvalidate", method=RequestMethod.POST)
	public ModelAndView LoginValidate(HttpSession ss, UserLoginModel userLoginModel) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject(ss);
		Login();
		mav.setViewName("loginView");
		return mav;
	}
}
