package com.antriksh.spring.data.jpa.api.service;

import java.util.*;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antriksh.spring.data.jpa.api.model.Employee;
import com.antriksh.spring.data.jpa.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	@PostConstruct
	public void initDB() {
		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(111,"Sandeep","cs",31,40));
		list1.add(new Employee(113,"Vihari","mca",35,60));
		list1.add(new Employee(114,"Dhanush","cs",30,50));
		list1.add(new Employee(115,"John","IT",33,45));
		list1.add(new Employee(116,"Naveen","mca",39,89));
		repository.saveAll(list1);
		
	}
	public List<Employee> getEmployee(){
		
		return repository.findAll();
		
	}
}
