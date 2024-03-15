package com.springsolr.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsolr.api.model.Employee;
import com.springsolr.api.repository.EmployeeRepository;
 
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@PostConstruct
	@PostMapping
	public void addEmployees() {
		System.out.println("Post Construct is running");
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(373, "Basant", new String[] { "Bangalore", "BTM" }));
		employees.add(new Employee(908, "Santosh", new String[] { "Hyderbad", "XYZ" }));
		employees.add(new Employee(321, "Sagar", new String[] { "Pune", "PQR" }));
		repository.saveAll(employees);
		System.out.println("Post Construct ended");
	}

	@GetMapping("/getALL")
	public Iterable<Employee> getEmployees() {
		return repository.findAll();
	}

	@GetMapping("/getEmployee/{name}")
	public Employee getEmployeeByName(@PathVariable String name) {
		return repository.findByName(name);
	}

}