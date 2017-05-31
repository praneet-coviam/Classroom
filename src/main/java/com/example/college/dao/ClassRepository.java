package com.example.college.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.college.Classroom;

@Repository
public interface ClassRepository extends CrudRepository<Classroom,String> {

}
