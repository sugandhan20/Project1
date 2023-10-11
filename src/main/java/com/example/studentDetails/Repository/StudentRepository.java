package com.example.studentDetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.studentDetails.Entity.Students;

public interface StudentRepository extends JpaRepository<Students,Integer>{
@Query(value = "select * from student where roll_number =? ",nativeQuery = true)
	Students getbyroll(int no);

	

		
	}


