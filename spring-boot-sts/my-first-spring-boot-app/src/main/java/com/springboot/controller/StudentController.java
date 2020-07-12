package com.springboot.controller;

import java.io.IOException;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.InvalidFieldException;
import com.springboot.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@PostMapping("/last")
	public String saveStudentInformation(@RequestBody Student student) {
		if(StringUtils.isEmpty(student.getLastName())){
			throw new InvalidFieldException("Last Name is required field.");
		}
		return "Data is saved";
	}
	
	@PostMapping("/first")
	public String saveFirstNameStudentInformation(@RequestBody Student student) throws IOException {
		if(StringUtils.isEmpty(student.getFirstName())){
			throw new IOException("First Name is required field.");
		}
		return "Data first is saved";
	}
	
}
