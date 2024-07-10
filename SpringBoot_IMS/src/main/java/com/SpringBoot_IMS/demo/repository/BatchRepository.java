package com.SpringBoot_IMS.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot_IMS.demo.model.Batch;

@Repository
public interface BatchRepository extends CrudRepository<Batch, Integer>{

	 Batch getByBid(int bid);
	 
	 void deleteByBid(int bid);
}
