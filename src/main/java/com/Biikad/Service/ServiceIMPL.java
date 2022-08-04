package com.Biikad.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Biikad.Model.Employee;
import com.Biikad.Repository.EmployeeRepo;

@Service
public class ServiceIMPL {
	
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee savedata(Employee employee) {
		
		Employee employee2 = employeeRepo.save(employee);
	
		
		return employee2;
		
		}

	public List <Employee> getalldata() {
		
		List<Employee> list = employeeRepo.findAll();
		
		return list;
		
	}
	
	public Employee getbydept() {
		
		Employee edept = employeeRepo.findByEdept("Devlopment");
		
		return edept;
		
	}
	
	
}

