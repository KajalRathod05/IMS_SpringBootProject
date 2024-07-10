package com.SpringBoot_IMS.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot_IMS.demo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

	Student getBySid(int sid);
	
	List<Student> deleteBySid(int sid);
}
