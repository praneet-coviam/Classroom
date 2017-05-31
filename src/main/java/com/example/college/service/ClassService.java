package com.example.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college.Classroom;
import com.example.college.dao.*;;

@Service
public class ClassService implements ClassServiceInterface{

	@Autowired
	private ClassRepository classrep;
		
	@Override
	public void insertClass(Classroom classroom) {
		// TODO Auto-generated method stub
		classrep.save(classroom);
	}

	@Override
	public void updateClass(Classroom classroom) {
		// TODO Auto-generated method stub
			classrep.save(classroom);
	}

	@Override
	public void deleteClass(Classroom classroom) {
		// TODO Auto-generated method stub
		classrep.delete(classroom);
	}


}
