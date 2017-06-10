package com.ramintaghizada.designpatterns.demo1.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ramintaghizada.designpatterns.demo1.view.PeopleChangedListener;

public class Model {
	private Set<Person> people = new HashSet<Person>();
	private PeopleChangedListener peopleChangedListener;
	public List<Person>getPeople(){
		return new ArrayList<Person>(people);
	}
	public void addPerson(Person person){
		people.add(person);
		fireDataChanged();
	}
	public void deletePerson(Person person){
		people.remove(person);
		fireDataChanged();
	}
	public void save () throws Exception{
		DAOFactory factory = DAOFactory.getFactory(DAOFactory.MYSQL);
		PersonDAO personDAO = factory.getPersonDAO();
		for(Person person : people){
			if(person.getId() !=0){
				personDAO.updatePerson(person);
			}
			else {
				personDAO.addPerson(new Person(person.getName(),person.getPassword()));
			}
		}
		load();
		fireDataChanged();
	}
	public void load() throws Exception {
		DAOFactory factory = DAOFactory.getFactory(DAOFactory.MYSQL);
		PersonDAO personDAO = factory.getPersonDAO();
		people.clear();
		people.addAll(personDAO.getPeople());
		fireDataChanged();
	}
	public void setPeopleChangedListener(PeopleChangedListener peopleChangedListener){
		this.peopleChangedListener = peopleChangedListener;
	}
	private void fireDataChanged() {
		if(peopleChangedListener != null){
			peopleChangedListener.onPeopleChanged();
		}
			
	}
}
