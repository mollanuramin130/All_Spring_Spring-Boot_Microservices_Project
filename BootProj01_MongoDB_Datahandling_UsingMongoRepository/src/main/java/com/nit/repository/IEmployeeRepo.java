package com.nit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nit.model.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, String>{
	
}
