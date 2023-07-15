package com.example.demo.service;

import java.util.Optional;

import javax.persistence.SecondaryTable;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;


@Service
public class StudentImpService implements StudentService{

	private StudentRepo stdRepo;
	
	public StudentImpService(StudentRepo stdRepo) {
		this.stdRepo = stdRepo;
	}

	@Override
	public Student saveStudent(Student std) {
		stdRepo.save(std);
		return std;
	}

	public Student getStdByRollNum(int rollNo) {
		Optional<Student> std = stdRepo.findById(rollNo);
		if(std.isPresent())  //if obj is there
		return std.get();
		return null;
	}

}
