package com.ramintaghizada.designpatterns.demo1.model;

import java.sql.SQLException;
import java.util.List;

public interface PersonDAO {

	void addPerson(Person person) throws SQLException;

	Person getPerson(int id);

	List<Person> getPeople() throws SQLException;

	int updatePerson(Person person) throws SQLException;

	int deletePerson(int id) throws SQLException;

	int deleteAll() throws SQLException;

}