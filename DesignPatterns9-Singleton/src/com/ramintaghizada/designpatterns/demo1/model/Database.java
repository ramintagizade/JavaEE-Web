package com.ramintaghizada.designpatterns.demo1.model;

public class Database {
	private static Database instance = new Database();
	public Database(){
		
	}
	public static Database getInstance(){
		return instance;
	}
	public void connect(){
		System.out.println("Connected");
	}
	public void disconnect(){
		System.out.println("Disconnected");
	}
}
