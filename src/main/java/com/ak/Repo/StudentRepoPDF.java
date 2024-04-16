/**
 * 
 */
package com.ak.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ak.entity.Student;

/**
 * @author Akshay Mandage
 *
 */
@Repository
public interface StudentRepoPDF extends JpaRepository<Student, Integer>{

}
