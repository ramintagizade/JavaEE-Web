package com.ramintaghizada.designpatterns.demo1.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class PersonDAO {
	public void addPerson(Person person) throws SQLException{
		Connection conn = Database.getInstance().getConnection();
		PreparedStatement p = conn.prepareStatement("INSERT INTO people (name,password) VALUES (?,?)");
		p.setString(1, person.getName());
		p.setString(2, person.getPassword());
		p.executeUpdate();
		p.close();
	}
	public Person getPerson(int id){
		return null;
	}
	public List<Person> getPeople() throws SQLException{
		List<Person>people = new ArrayList<Person>();
		Connection conn = Database.getInstance().getConnection();
		String sql = "SELECT id,name,password FROM people ORDER BY id";
		Statement selectStatement = conn.createStatement();
		ResultSet results = selectStatement.executeQuery(sql);
		while(results.next()){
			int id = results.getInt("id");
			String name = results.getString("name");
			String password = results.getString("password");
			Person person = new Person(id,name,password);
			people.add(person);
		}
		results.close();
		selectStatement.close();
		return people;
		
	}
	public void updatePerson(Person person) {
		
	}
	
	public void deletePerson(int id) {
		
	}

}
