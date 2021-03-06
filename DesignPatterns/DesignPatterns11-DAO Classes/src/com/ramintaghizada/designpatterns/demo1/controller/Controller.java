package com.ramintaghizada.designpatterns.demo1.controller;

import java.sql.SQLException;

import com.ramintaghizada.designpatterns.demo1.model.Model;
import com.ramintaghizada.designpatterns.demo1.model.Person;
import com.ramintaghizada.designpatterns.demo1.model.PersonDAO;
import com.ramintaghizada.designpatterns.demo1.view.LoginFormEvent;
import com.ramintaghizada.designpatterns.demo1.view.LoginListener;
import com.ramintaghizada.designpatterns.demo1.view.View;

public class Controller implements LoginListener{
	private View view;
	private Model model;
	private PersonDAO personDAO = new PersonDAO();
	public Controller(View view, Model model) {
		super();
		this.view = view;
		this.model = model;
	}
	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login Event received: "+event.getName()+"; "+event.getPassword());
		
		try {
			personDAO.addPerson(new Person(event.getName(),event.getPassword()));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
