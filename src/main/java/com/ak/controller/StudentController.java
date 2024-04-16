/**
 * 
 */
package com.ak.controller;

import java.io.IOException;
import java.util.List;
import com.ak.util.PDFGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ak.entity.Student;
import com.ak.service.StudentService;
import com.lowagie.text.DocumentException;

import jakarta.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.ak.util.PDFGenerator;


/**
 * @author Akshay Mandage
 *
 */
@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/export-to-pdf")
	public void generatePdfFile(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
		String currentDateTime = dateFormat.format(new Date());
		String headerkey = "Content-Disposition";
		String headervalue = "attachment; filename=student" + currentDateTime + ".pdf";
		response.setHeader(headerkey, headervalue);
		List<Student> listofStudents = studentService.getStudentList();
		PDFGenerator generator = new PDFGenerator();
		generator.generate(listofStudents, response);
	}
}
