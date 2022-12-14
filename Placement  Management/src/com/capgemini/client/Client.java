package com.capgemini.client;

import com.capgemini.entities.Certificate;
import com.capgemini.entities.College;
import com.capgemini.entities.Student;
import com.capgemini.entities.User;
import com.capgemini.services.CollegeService;
import com.capgemini.services.CollegeServiceImpl;
import com.capgemini.services.StudentService;
import com.capgemini.services.StudentServiceImpl;


public class Client {

	public static void main(String[] args) {
		
		
	/*
		Student student=new Student();
		StudentService service=new StudentServiceImpl();
		
		student.setId(10);
		student.setRoll(104);
		student.setQualification("BE");
		student.setCourse("IT");
		student.setYear(2022);
		student.setHallTicketNo(1234);
		
		
		Certificate certificate=new Certificate();
		certificate.setCert_id(1235);
		certificate.setYear(2022);
		
		//oneToOne bidirectional
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
		//adding a data
		service.addStudent(student);
		
		//Retrieving a data
		//service.searchStudentById(12);
		System.out.println("Id is: "+student.getId());
		System.out.println("Course is: "+student.getCourse());
	*/
		College college=new College();
		CollegeService service=new CollegeServiceImpl();
		
		college.setClg_Id(101);
		college.setCollegeName("Pillai");
		college.setLocation("Panvel");
	
		User user=new User();
		user.setId(21);
		user.setName("sayali");
		user.setType("student");
		user.setPassword("abcd");
		
		//one to onedirection 
		college.setUser(user);
		user.setCollege(college);
		
		//add college 
		service.addCollege(college);
		
		//Retrieving a data
				//service.searchStudentById(12);
		System.out.println("College Id is : "+college.getClg_Id());
		System.out.println("College name is : "+college.getCollegeName());

		
		System.out.println("Data is updated");
			
		
		
		
		
		



	}

}
