package com.antriksh.spring.data.jpa.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antriksh.spring.data.jpa.api.service.EmployeeService;
import java.util.*;
import com.antriksh.spring.data.jpa.api.model.Employee;

@RestController
@RequestMapping("\spring-data-jpa")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@GetMapping("/getEmployee")
	public List<Employee> getAllEmployee() {
		return service.getEmployee();
	}

}
