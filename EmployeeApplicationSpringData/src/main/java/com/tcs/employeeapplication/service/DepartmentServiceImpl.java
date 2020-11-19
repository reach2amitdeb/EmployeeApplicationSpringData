package com.tcs.employeeapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employeeapplication.dao.DepartmentDAO;
import com.tcs.employeeapplication.model.Department;
import com.tcs.employeeapplication.model.Employee;
import com.tcs.employeeapplication.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
//	public DepartmentServiceImpl() {
//		// TODO Auto-generated constructor stub
//	}
//	private static DepartmentService dao;
//	
//	public static DepartmentService getInstance()
//	{
//		if(dao == null)
//		{
//			dao = new DepartmentServiceImpl();
//			return dao;
//		}
//		else
//			return dao;
//	}
	@Override
	public String addDepartment(Department department) {
		// TODO Auto-generated method stub
		Department department2 = null;
		try {
			department2 = departmentRepository.save(department);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String updateDepartment(Department department) {
		// TODO Auto-generated method stub
		Department department2 = null;
		try {
			department2 = departmentRepository.save(department);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String deleteDepartment(long id) {
		// TODO Auto-generated method stub
		try {
			departmentRepository.deleteById(id);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public Optional<Department> findById(long id) {
		// TODO Auto-generated method stub
		Optional<Department>department2 = null;
		try {
			department2 = departmentRepository.findById(id);
			return department2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Optional.empty();
		}
	}

	@Override
	public Optional<List<Department>> getDepartments() {
		// TODO Auto-generated method stub
		Optional<List<Department>>department2 = null;
		try {
			department2 = Optional.ofNullable(departmentRepository.findAll());
			return department2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Optional.empty();
		}
	}

//	@Override
//	public Optional<List<Employee>> findEmployeesByDepartmentId(long id) {
//		// TODO Auto-generated method stub
//		return deptDao.findEmployeesByDepartmentId(id);
//	}

}
