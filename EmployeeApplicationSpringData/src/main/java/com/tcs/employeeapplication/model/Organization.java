package com.tcs.employeeapplication.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "organization_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
	@Id
	private long id;
	private String name;
	private String address;
	//private List<Department> departments;
	//private List<Employee> employees;
}
