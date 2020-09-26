package com.antriksh.spring.data.jpa.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table
public class Employee {
	
	
	@Id
	private int empId;
	private String empName;
	private String empProfession;
	private int empAge;
	private int empSalary;
	
	public Employee(int empId, String empName, String empProfession, int empAge, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empProfession = empProfession;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
}
