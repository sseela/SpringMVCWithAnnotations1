package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BasicController {

	@Autowired
	private MyService service;
	
	
	public MyService getService() {
		return service;
	}


	public void setService(MyService service) {
		this.service = service;
	}

	
	@RequestMapping(value="/showView", method = RequestMethod.GET)
	public String justMethod(Model model) throws Exception {
		
		model.addAttribute("serviceMsg", service.service());
		return "second";
	}

}
