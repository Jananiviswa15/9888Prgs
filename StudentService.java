package com.example.demo.service;

import com.example.demo.model.Student;

public interface StudentService {

	Student saveStudent(Student std);
	Student getStdByRollNum(int rollNo);
}