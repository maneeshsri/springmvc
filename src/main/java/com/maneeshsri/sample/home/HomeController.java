package com.maneeshsri.sample.home;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@ModelAttribute DisplayData data) {
		return "homePage";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String weather(@Valid @ModelAttribute DisplayData data, Errors errors, Model model){
		if(errors.hasErrors()){
			model.addAttribute("error", "error");
		}
		else{
			DisplayData result = service.getWeatherData(data.getZip());
			model.addAttribute(result);
		}
	    
	    return "homePage";
	}
}
