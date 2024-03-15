package com.springsolr.api.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.springsolr.api.model.Employee;

public interface EmployeeRepository extends SolrCrudRepository<Employee, Integer>{

	Employee findByName(String name);

}