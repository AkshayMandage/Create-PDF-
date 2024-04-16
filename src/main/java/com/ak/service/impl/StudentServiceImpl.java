/**
 * 
 */
package com.ak.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.Repo.StudentRepoPDF;
import com.ak.entity.Student;
import com.ak.service.StudentService;

/**
 * @author Akshay Mandage
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepoPDF studentRepo;
	
	@Override
	public void addStudent(Student student) {
		this.studentRepo.save(student);
		
	}

	@Override
	public List<Student> getStudentList() {
		return  this.studentRepo.findAll();
	}

	

}
