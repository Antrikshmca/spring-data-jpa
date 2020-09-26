package com.antriksh.spring.data.jpa.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antriksh.spring.data.jpa.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
