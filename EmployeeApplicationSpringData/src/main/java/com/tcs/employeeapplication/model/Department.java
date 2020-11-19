package com.tcs.employeeapplication.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "department_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	@Id
	private long id;
	private long organizationId;
	private String name;
	//private List<Employee> employees;
}
