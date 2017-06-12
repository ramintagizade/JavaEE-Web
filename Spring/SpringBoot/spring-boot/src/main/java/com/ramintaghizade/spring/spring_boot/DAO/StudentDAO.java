package com.ramintaghizade.spring.spring_boot.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ramintaghizade.spring.spring_boot.Entity.Student;

@Repository
public class StudentDAO {
	private static Map<Integer,Student> students;
	static {
		students = new HashMap<Integer,Student>(){
			{
				put(1,new Student(1,"Ramin","Computer Science"));
				put(2,new Student(2,"Alex","Finance"));
				put(3,new Student(3,"Anna","Maths"));
			}
		};
	}
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
}
