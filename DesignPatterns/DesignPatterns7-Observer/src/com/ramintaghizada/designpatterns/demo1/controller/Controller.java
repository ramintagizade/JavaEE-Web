package com.ramintaghizada.designpatterns.demo1.controller;

import com.ramintaghizada.designpatterns.demo1.model.Model;
import com.ramintaghizada.designpatterns.demo1.view.View;

public class Controller {
	private View view;
	private Model model;
	public Controller(View view, Model model) {
		super();
		this.view = view;
		this.model = model;
	}
	
}
