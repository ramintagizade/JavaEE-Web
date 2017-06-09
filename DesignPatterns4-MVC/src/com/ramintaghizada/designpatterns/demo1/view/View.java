package com.ramintaghizada.designpatterns.demo1.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import com.ramintaghizada.designpatterns.demo1.model.Model;

public class View extends JFrame{
	private Model model;

	public View(Model model) throws HeadlessException {
		super("MVC Demo");
		this.model = model;
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridheight = 0;
		gc.gridwidth = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		setSize(600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
