package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.StudentBean;


//response json 

@RestController
public class StudentController {


	//Student 
	//student table
	//bean 
	//dao 
	//controller 

	
	//add student -> POST 
	@PostMapping("/student")
	public ResponseEntity<?> addStudent(@RequestBody StudentBean student) {
		
		return ResponseEntity.ok(student);
	}

	@PostMapping("/studentlogin")
	public ResponseEntity<?> studentLogin(@RequestBody StudentBean student) {
		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(student);
	}

//LOGIN -> email password correct => 200 , and wrong => 401 
}










