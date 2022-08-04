package com.Biikad.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Biikad.Model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Serializable> {
	
	public Employee findByEdept (String edept);

}
