package com.example.studentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentDetails.Dao.StudentDao;
import com.example.studentDetails.Entity.Students;
import com.example.studentDetails.Exception.AgeNotFoundException;
@Service
public class StudentService {
@Autowired
StudentDao stuDao;

	public String addstud(Students add)throws AgeNotFoundException {
		
		return stuDao.addstud(add);
	}

	public List<Students> listall() {
		
		return stuDao.listall();
	}

	public String delete(int d) {
		
		return stuDao.delete(d);
	}

	public Students getbyroll(int no) {
		return stuDao.getbyroll(no);
	}

}
