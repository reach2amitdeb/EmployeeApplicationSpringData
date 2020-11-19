package com.tcs.employeeapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employeeapplication.dao.OrganizationDAO;
import com.tcs.employeeapplication.model.Department;
import com.tcs.employeeapplication.model.Employee;
import com.tcs.employeeapplication.model.Organization;
import com.tcs.employeeapplication.repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	OrganizationRepository organizationRepository;

//	public OrganizationServiceImpl() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	private static OrganizationService dao;
//	
//	public static OrganizationService getInstance() {
//		if(dao==null)
//		{
//			dao = new OrganizationServiceImpl();
//			return dao;
//		}
//		else
//			return dao;
//	}
//	

	@Override
	public String addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		Organization organization2 = null;
		try {
			organization2 = organizationRepository.save(organization);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String updateOrganization(Organization organization) {
		// TODO Auto-generated method stub
		Organization organization2 = null;
		try {
			organization2 = organizationRepository.save(organization);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String deleteOrganization(long id) {
		// TODO Auto-generated method stub
		try {
			organizationRepository.deleteById(id);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public Optional<Organization> findById(long id) {
		// TODO Auto-generated method stub
		Optional<Organization> organization = null;
		try {
			organization = organizationRepository.findById(id);
			return organization;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Optional.empty();
		}
	}

	@Override
	public Optional<List<Organization>> getOrganizations() {
		// TODO Auto-generated method stub
		Optional<List<Organization>> organization = null;
		try {
			organization = Optional.ofNullable(organizationRepository.findAll());
			return organization;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Optional.empty();
		}
	}

//	@Override
//	public Optional<List<Department>> findDepartmentsByOrganizationId(long id) {
//		// TODO Auto-generated method stub
//		return orgDao.findDepartmentsByOrganizationId(id);
//	}
//
//	@Override
//	public Optional<List<Employee>> findEmployeesByOrganizationId(long id) {
//		// TODO Auto-generated method stub
//		return orgDao.findEmployeesByOrganizationId(id);
//	}

}
