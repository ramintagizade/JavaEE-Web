package com.ramintaghizada.designpatterns.demo1.model;

import java.util.List;

public interface LogDAO {

	void addEntry(String message);

	List<Log> getEntries();

}