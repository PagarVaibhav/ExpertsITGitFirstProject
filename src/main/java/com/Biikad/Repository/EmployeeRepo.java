package com.Biikad.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Biikad.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Serializable> {

}
