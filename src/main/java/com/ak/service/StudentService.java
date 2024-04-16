/**
 * 
 */
package com.ak.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ak.entity.Student;

/**
 * @author Akshay Mandage
 *
 */
@Service
public interface StudentService {

	void addStudent(Student student);
	List<Student> getStudentList();
}
