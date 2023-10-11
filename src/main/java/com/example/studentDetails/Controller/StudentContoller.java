package com.example.studentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentDetails.Entity.Students;
import com.example.studentDetails.Exception.AgeNotFoundException;
import com.example.studentDetails.Service.StudentService;

@RestController
@RequestMapping(value="students")
public class StudentContoller {
@Autowired
StudentService stuSer;
@PostMapping(value="/add")
public String addstud(@RequestBody Students add)throws AgeNotFoundException {
	return stuSer.addstud(add);
}
@GetMapping(value="/all")
public List<Students> listall() {
	return stuSer.listall();
}
@DeleteMapping(value="/delete/{d}")
public String delete(@PathVariable int d) {
	return stuSer.delete(d);
}
@GetMapping(value="/getbyroll/{no}")
public Students getbyroll(@PathVariable int no) {
	return stuSer.getbyroll(no);
}
}
