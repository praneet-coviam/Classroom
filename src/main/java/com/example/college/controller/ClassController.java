package com.example.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.Classroom;


import com.example.college.service.ClassServiceInterface;

@RestController
public class ClassController {

	@Autowired
	ClassServiceInterface classsvc;
	
	private Classroom classroom;
	
	@RequestMapping("/")
	public String index(){
        return "Greetings from College";
    }
	
	@RequestMapping("/class")
    public String labIndex(){
        return "Greetings from Classroom";
    }
	
	@RequestMapping("/class/save/{building}/{roomNumber}/{roomCapacity}/{isDigitallyEnabled}")
    public String save(@PathVariable("building") String building,@PathVariable("roomNumber") int roomNumber,@PathVariable("roomCapacity") int roomCapacity,@PathVariable("isDigitallyEnabled") int isDigitallyEnabled){
        classroom.setBuilding(building);
        classroom.setRoomNumber(roomNumber);
        classroom.setRoomCapacity(roomCapacity);
        classroom.setIsDigitallyEnabled(isDigitallyEnabled);
        classsvc.insertClass(classroom);
        return "data saved";
    }	
	
	@RequestMapping("/class/update/{building}/{roomNumber}/{roomCapacity}/{isDigitallyEnabled}")
    public String update(@PathVariable("building") String building,@PathVariable("roomNumber") int roomNumber,@PathVariable("roomCapacity") int roomCapacity,@PathVariable("isDigitallyEnabled") int isDigitallyEnabled){
        classroom.setBuilding(building);
        classroom.setRoomNumber(roomNumber);
        classroom.setRoomCapacity(roomCapacity);
        classroom.setIsDigitallyEnabled(isDigitallyEnabled);
        classsvc.updateClass(classroom);
        return "data updated";
    }	
	
	@RequestMapping("/class/delete/{building}/{roomNumber}")
    public String delete(@PathVariable("building") String building,@PathVariable("roomNumber") int roomNumber){
        classroom.getBuilding();
        classroom.getRoomNumber();
        classsvc.deleteClass(classroom);
        return "data deleted";
    }
}
