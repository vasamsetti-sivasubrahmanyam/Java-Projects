package com.cg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cg.beans.Trainee;

@Controller
public class URIController {

	@RequestMapping(value="/")
	public String getIndexPage() {
		return "loginPage";
	}
	@RequestMapping(value="/index")
	public String getIndexxPage() {
		return "indexListPage";
	}
	@RequestMapping(value="/add")
	public String getAddPage() {
		return "addTraineePage";
	}

	@RequestMapping(value="/delete")
	public String getDeletePage() {
		return "deleteDispPage";
	}

	@RequestMapping(value="/modify")
	public String getModifyPage() {
		return "modifyDispPage";
	}

	@RequestMapping(value="/view")
	public String getViewPage() {
		return "viewDispPage";
	}

	@ModelAttribute("trainee")
	public Trainee getTrainee() {
	return new Trainee();
}
}
