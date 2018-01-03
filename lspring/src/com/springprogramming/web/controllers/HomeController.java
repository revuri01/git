package com.springprogramming.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springprogramming.web.dao.Details;
import com.springprogramming.web.services.DetailsService;

@Controller
public class HomeController {

	private DetailsService dservice;

	@Autowired
	public void setDservice(DetailsService dservice) {
		this.dservice = dservice;
	}

	@RequestMapping("/")
	public String getHome(Model model) {
		List<Details>details = dservice.getCurrent();
		model.addAttribute("details", details);
		return "home";
	}

}
