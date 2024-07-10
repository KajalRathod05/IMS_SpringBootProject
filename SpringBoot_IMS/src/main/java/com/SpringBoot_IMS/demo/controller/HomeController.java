package com.SpringBoot_IMS.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBoot_IMS.demo.model.Batch;
import com.SpringBoot_IMS.demo.model.Course;
import com.SpringBoot_IMS.demo.model.Faculty;
import com.SpringBoot_IMS.demo.model.Student;
import com.SpringBoot_IMS.demo.servicei.ServiceI;

@Controller
public class HomeController {

	@Autowired
	ServiceI ssi;

	@RequestMapping("/")
	public String preLog() {
		System.out.println("Hello...");
		return "login";
	}

	@RequestMapping("/log")
	public String adminPage(@RequestParam("username") String unm, @RequestParam("password") String pass) {
		if (unm.equals("ADMIN") && pass.equals("ADMIN"))
			return "admin";
		else
			return "login";
	}

	// Course
	@RequestMapping("/addcourse")
	public String course() {
		return "course";
	}

	@RequestMapping("/coursedata")
	public String addCourse(@ModelAttribute Course c) {
		ssi.addCourse(c);
		return "admin";
	}
	@RequestMapping("/viewcourse")
	public String viewCourse(ModelMap m) {
		List<Course> clist = ssi.viewCourse();
		m.put("cl", clist);
		return "vcourse";
	}
	@RequestMapping("editc")
	public String editCourse(@RequestParam("cid") int cid,ModelMap m)
	{
		Course c=ssi.editCourse(cid);
		m.put("c", c);
		return "editC";
	}
	@RequestMapping("updatec")
	public String updateCourse(@ModelAttribute Course c,ModelMap m)
	{
		List<Course> clist=ssi.updateCourse(c);
		m.put("cl", clist);
		return "vcourse";
	}
	@RequestMapping("deletec")
	public String deleteCourse(@RequestParam("cid") int cid,ModelMap m)
	{
		List<Course> clist=ssi.deleteCourse(cid);
		m.put("cl", clist);
		return "vcourse";
	}

	
	//Batch
	@RequestMapping("/addbatch")
	public String batch() {
		return "batch";
	}
	@RequestMapping("/batchdata")
	public String addBatch(@ModelAttribute Batch b) {
		ssi.addBatch(b);
		return "admin";
	}

	@RequestMapping("/viewbatch")
	public String viewBatch(ModelMap m) {
		List<Batch> blist = ssi.viewBatch();
		m.put("bl", blist);
		return "vbatch";
	}
	@RequestMapping("editb")
	public String editBatch(@RequestParam("bid") int bid,ModelMap m)
	{
		Batch b=ssi.editBatch(bid);
		m.put("b", b);
		return "editB";
	}
	@RequestMapping("updateb")
	public String updateBatch(@ModelAttribute Batch b,ModelMap m)
	{
		List<Batch> blist=ssi.updateBatch(b);
		m.put("bl", blist);
		return "vbatch";
	}
	@RequestMapping("deleteb")
	public String deleteBatch(@RequestParam("bid") int bid,ModelMap m)
	{
		List<Batch> blist=ssi.deleteBatch(bid);
		m.put("bl", blist);
		return "vbatch";
	}
	
	
	// Faculty
	@RequestMapping("/addfaculty")
	public String faculry(ModelMap m) {
		List<Course> clist = ssi.viewCourse();
		m.put("cl", clist);
		List<Batch> blist = ssi.viewBatch();
		m.put("bl", blist);
		return "faculty";
	}
	@RequestMapping("/facultydata")
	public String addFaculty(@ModelAttribute Faculty f) {
		ssi.addFaculty(f);
		return "admin";
	}
	@RequestMapping("/viewfaculty")
	public String viewFaculty(ModelMap m) {
		List<Faculty> flist = ssi.viewFaculty();
		m.put("fl", flist);
		return "vfaculty";
	}
	@RequestMapping("editf")
	public String editFaculty(@RequestParam("fid") int fid,ModelMap m)
	{
		Faculty f=ssi.editFaculty(fid);
		m.put("f", f);
		List<Course> clist = ssi.viewCourse();
		m.put("cl", clist);
		List<Batch> blist = ssi.viewBatch();
		m.put("bl", blist);
		return "editF";
	}
	@RequestMapping("updatef")
	public String updateFaculty(@ModelAttribute Faculty f,ModelMap m)
	{
		List<Faculty> flist=ssi.updateFaculty(f);
		m.put("fl", flist);
		return "vfaculty";
	}
	@RequestMapping("deletef")
	public String deleteFaculty(@RequestParam("fid") int fid,ModelMap m)
	{
		List<Faculty> flist=ssi.deleteFaculty(fid);
		m.put("fl", flist);
		return "vfaculty";
	}

	
	
	// Student
	@RequestMapping("/addstudent")
	public String student(ModelMap m) {
		List<Course> clist = ssi.viewCourse();
		m.put("cl", clist);
		List<Batch> blist = ssi.viewBatch();
		m.put("bl", blist);
		List<Faculty> flist = ssi.viewFaculty();
		m.put("fl", flist);
		return "student";
	}
	@RequestMapping("/studentdata")
	public String addStudent(@ModelAttribute Student s) {
		ssi.addStudent(s);
		return "admin";
	}
	@RequestMapping("/viewstudent")
	public String viewStudent(ModelMap m) {
		List<Student> slist = ssi.viewStudent();
		m.put("sl", slist);
		return "vstudent";
	}
	@RequestMapping("edits")
	public String editStudent(@RequestParam("sid") int sid,ModelMap m)
	{
		Student s=ssi.editStudent(sid);
		m.put("s", s);
		List<Course> clist = ssi.viewCourse();
		m.put("cl", clist);
		List<Batch> blist = ssi.viewBatch();
		m.put("bl", blist);
		List<Faculty> flist = ssi.viewFaculty();
		m.put("fl", flist);
		return "editS";
	}
	@RequestMapping("updates")
	public String updateStudent(@ModelAttribute Student s,ModelMap m)
	{
		List<Student> slist=ssi.updateFaculty(s);
		m.put("sl", slist);
		return "vstudent";
	}
	@RequestMapping("deletes")
	public String deleteStudent(@RequestParam("sid") int sid,ModelMap m)
	{
		List<Student> slist=ssi.deleteStudent(sid);
		m.put("sl", slist);
		return "vstudent";
	}

}
