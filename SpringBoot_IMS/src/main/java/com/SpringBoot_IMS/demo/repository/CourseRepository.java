package com.SpringBoot_IMS.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot_IMS.demo.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

	Course getByCid(int cid);
	
	List<Course> deleteByCid(int cid);
}
