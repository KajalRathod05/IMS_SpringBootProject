package com.SpringBoot_IMS.demo.servicei;

import java.util.List;

import com.SpringBoot_IMS.demo.model.Batch;
import com.SpringBoot_IMS.demo.model.Course;
import com.SpringBoot_IMS.demo.model.Faculty;
import com.SpringBoot_IMS.demo.model.Student;

public interface ServiceI {

	void addCourse(Course c);
    List<Course> viewCourse();
	Course editCourse(int cid);
    List<Course> updateCourse(Course c);
	List<Course> deleteCourse(int cid);

	void addBatch(Batch b);
    List<Batch> viewBatch();
	Batch editBatch(int bid);
    List<Batch> updateBatch(Batch b);
    List<Batch> deleteBatch(int bid);


	void addFaculty(Faculty f);
    List<Faculty> viewFaculty();
	Faculty editFaculty(int fid);
    List<Faculty> updateFaculty(Faculty f);
    List<Faculty> deleteFaculty(int fid);


	void addStudent(Student s);
	List<Student> viewStudent();
	Student editStudent(int sid);
	List<Student> updateFaculty(Student s);
	List<Student> deleteStudent(int sid);
	

}

