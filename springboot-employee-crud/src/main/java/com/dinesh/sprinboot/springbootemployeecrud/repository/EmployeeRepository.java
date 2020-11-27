package com.dinesh.sprinboot.springbootemployeecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.sprinboot.springbootemployeecrud.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Long>{
	

}
