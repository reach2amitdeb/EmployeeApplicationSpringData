package com.tcs.employeeapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employeeapplication.dao.EmployeeDAO;
import com.tcs.employeeapplication.model.Department;
import com.tcs.employeeapplication.model.Employee;
import com.tcs.employeeapplication.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
//	private static EmployeeService dao;
//
//	private EmployeeServiceImpl() {
//		// TODO Auto-generated constructor stub
//	}
//	public static EmployeeService getInstance() {
//		
//		if(dao==null) {
//			dao = new EmployeeServiceImpl();
//			System.out.println("inside the if condition");
//			return dao;
//		}
//		return dao;
//		
//		
//	}
	
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2 = null;
		try {
			employee2 = employeeRepository.save(employee);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employee2 = null;
		try {
			employee2 = employeeRepository.save(employee);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String deleteEmployee(long id) {
		// TODO Auto-generated method stub
		
		try {
			employeeRepository.deleteById(id);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public Optional<Employee> findById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee2 = null;
		try {
			employee2 = employeeRepository.findById(id);
			return employee2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Optional.empty();
		}
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		Optional<List<Employee>> employee2 = null;
		try {
			employee2 = Optional.ofNullable(employeeRepository.findAll());
			return employee2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Optional.empty();
		}	}

//	@Override
//	public Optional<List<Employee>> findByOrganizationId(long id) {
//		// TODO Auto-generated method stub
//		return empdao.findByOrganizationId(id);
//	}

}
