package com.example.studentDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.studentDetails.Entity.Students;
import com.example.studentDetails.Exception.AgeNotFoundException;
import com.example.studentDetails.Repository.StudentRepository;
@Repository
public class StudentDao {
@Autowired
StudentRepository stuRepo;
	public String addstud(Students add)throws AgeNotFoundException {
	   if(add.getAge()>18) {
		   stuRepo.save(add);
		   return "Added Successfully";
	   }	
	   else {
		   throw new AgeNotFoundException ("YOUR AGE IS BELOW 188");
	   }
	}
	public List<Students> listall() {
		
		return stuRepo.findAll();
	}
	public String delete(int d) {
		
	//	stuRepo.delete(d);
		return "Deleted";
	}
	public Students getbyroll(int no) {
		return stuRepo.getbyroll(no);
	}
}
