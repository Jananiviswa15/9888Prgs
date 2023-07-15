package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentImpService;

//this accepts http rewuest methods (get put post update from the client)


@RestController
public class StudentController {

	
	private StudentImpService stdImpl;
	
	public StudentController(StudentImpService stdImpl) {
		this.stdImpl = stdImpl;
	}

	
	@PostMapping
	@RequestMapping("insertEmployees")
	//@rerqbody --> convert json val to java object
	public ResponseEntity<Student> insertStudentRec(@RequestBody Student std){
		return new ResponseEntity<Student>( stdImpl.saveStudent(std), HttpStatus.CREATED);
	}
	
	
	
	//rollno --> path var
	@GetMapping("readStdDetails/{rollNo}")
	public ResponseEntity<Student> getStdById(@PathVariable("rollNo") int rollNo){
		return new ResponseEntity<Student>( stdImpl.getStdByRollNum(rollNo), HttpStatus.OK);	
	}
	
	
}
