package com.Biikad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Biikad.Model.Employee;
import com.Biikad.Service.ServiceIMPL;

@RestController
public class EmployeeController {
	
	@Autowired
  private ServiceIMPL serviceIMPL;
	
	@PostMapping(value="/saveData" , consumes="application/json")
	public ResponseEntity<Employee> saveData(@RequestBody Employee employee) {
		
		Employee employee2 = serviceIMPL.savedata(employee);
		
		return new ResponseEntity<Employee>(employee2, HttpStatus.OK) ;
		
		
	}
	@GetMapping(value="/getData" , produces="application/json")
	public List <Employee> getalldata(){
		
		List<Employee> list = serviceIMPL.getalldata();
		
		
		return list;
	}
	
	@GetMapping(value="/getbydept" , produces="application/json")
	public Employee getbyEdept() {
		
		Employee employee = serviceIMPL.getbydept();
		
		return employee;
		
		
	}

}
