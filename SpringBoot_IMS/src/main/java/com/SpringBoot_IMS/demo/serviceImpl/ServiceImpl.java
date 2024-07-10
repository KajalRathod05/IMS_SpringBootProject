package com.SpringBoot_IMS.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_IMS.demo.model.Batch;
import com.SpringBoot_IMS.demo.model.Course;
import com.SpringBoot_IMS.demo.model.Faculty;
import com.SpringBoot_IMS.demo.model.Student;
import com.SpringBoot_IMS.demo.repository.BatchRepository;
import com.SpringBoot_IMS.demo.repository.CourseRepository;
import com.SpringBoot_IMS.demo.repository.FacultyRepository;
import com.SpringBoot_IMS.demo.repository.StudentRepository;
import com.SpringBoot_IMS.demo.servicei.ServiceI;

import jakarta.transaction.Transactional;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	CourseRepository cr;
	
	@Autowired
	BatchRepository br;
	
	@Autowired
	FacultyRepository fr;
	
	@Autowired
	StudentRepository sr;
	
	
	
	//Course Operations
	@Override
	public void addCourse(Course c) {
		cr.save(c);
	}
	@Override
	public List<Course> viewCourse() {

		return (List<Course>) cr.findAll();
	}
	@Override
	public Course editCourse(int cid) {

		return cr.getByCid(cid);
	}
	@Override
	public List<Course> updateCourse(Course c) {
		cr.save(c);
		return (List<Course>) cr.findAll();
	}
	@Override
	@Transactional
	public List<Course> deleteCourse(int cid) {
		
		cr.deleteByCid(cid);
		return (List<Course>) cr.findAll();
	}

	
	//Batch Operations	
	@Override
	public void addBatch(Batch b) {
		br.save(b);
	}

	@Override
	public List<Batch> viewBatch() {
		
		return (List<Batch>) br.findAll();
	}
	@Override
	public Batch editBatch(int bid) {
		
		return br.getByBid(bid);
	}
	@Override
	public List<Batch> updateBatch(Batch b) {
		
		br.save(b);
		return (List<Batch>) br.findAll();
	}
	@Override
	@Transactional
	public List<Batch> deleteBatch(int bid) {
		
		br.deleteByBid(bid);
		return (List<Batch>) br.findAll();
	}
	

	//Faculty Operations
	@Override
	public void addFaculty(Faculty f) {
       fr.save(f);		
	}
	@Override
	public List<Faculty> viewFaculty() {
		
		return (List<Faculty>) fr.findAll();
	}
	@Override
	public Faculty editFaculty(int fid) {
		
		return fr.getByFid(fid);
	}
	@Override
	public List<Faculty> updateFaculty(Faculty f) {
		fr.save(f);
		return (List<Faculty>) fr.findAll() ;
	}
	@Override
	@Transactional
	public List<Faculty> deleteFaculty(int fid) {
		fr.deleteByFid(fid);
		return (List<Faculty>) fr.findAll();
	}

	
	
	//Student Operations
	@Override
	public void addStudent(Student s) {
         sr.save(s);		
	}

	@Override
	public List<Student> viewStudent() {
		return (List<Student>) sr.findAll();
	}
	@Override
	public Student editStudent(int sid) {
		
		return sr.getBySid(sid);
	}
	@Override
	public List<Student> updateFaculty(Student s) {
		sr.save(s);
		return (List<Student>) sr.findAll();
	}
	@Override
	@Transactional
	public List<Student> deleteStudent(int sid) {
		
		sr.deleteBySid(sid);
		return (List<Student>) sr.findAll();
	}
	
	

	

	
	

}
