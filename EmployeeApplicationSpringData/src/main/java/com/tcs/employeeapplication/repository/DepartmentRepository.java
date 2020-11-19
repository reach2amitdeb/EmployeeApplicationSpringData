package com.tcs.employeeapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.employeeapplication.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
}
