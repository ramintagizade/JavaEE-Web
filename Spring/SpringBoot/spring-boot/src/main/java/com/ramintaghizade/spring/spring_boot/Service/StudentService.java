package com.ramintaghizade.spring.spring_boot.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramintaghizade.spring.spring_boot.DAO.StudentDAO;
import com.ramintaghizade.spring.spring_boot.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	
	public Collection<Student> getAllStudents(){
		return studentDAO.getAllStudents();
	}
	
}
