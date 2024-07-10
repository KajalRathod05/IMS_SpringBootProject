package com.SpringBoot_IMS.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot_IMS.demo.model.Faculty;

@Repository
public interface FacultyRepository extends CrudRepository<Faculty, Integer>{

	 Faculty getByFid(int fid);
	 
	 List<Faculty> deleteByFid(int fid);
}
