package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.StudentBean;

@RestController
public class SessionController {

	
	//signup -> post { firstName,email,password }  
	//@PostMapping("/signup")
	
	//login -> post 
	//email and password 
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody  StudentBean student){
		
		
		String hashPassword = encoder.encode(student.getPassword());
		student.setPassword(hashPassword); 
		//dao.saveStudent(student); 
		return ResponseEntity.ok(student);
	}

	 
	
}   
