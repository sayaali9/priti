package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.ServiceI;

@RestController
@RequestMapping("/api")
public class Homecontroller {
	
	@Autowired
	private ServiceI service;
	
	@PostMapping("/save")
	public ResponseEntity<String> savedata(@RequestBody Employee e)
	{
		Employee e1=service.savedata(e);
		return new ResponseEntity<String> ("Employee saved",HttpStatus.CREATED);
	
	}

	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getData()
	{
		List<Employee> e1=service.getdata();
		return new  ResponseEntity<List<Employee>>(e1,HttpStatus.OK);
	}
	
	@PutMapping("/put")
	public  ResponseEntity<String> updatedata(@RequestBody Employee e)
	{
		Employee e1=service.updatedata(e);
		return new ResponseEntity<String> ("Employee updated",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{eid}")
	public  ResponseEntity<String> deletedata(@PathVariable int eid)
	{
		service.deletedata(eid);
		 return new ResponseEntity<String>("Employee deleted",HttpStatus.OK);
	}
	
	@GetMapping("/getsingle/{name}")
	public ResponseEntity<Employee> getsingledata(@PathVariable String name)
	{
		Employee e1=service.getsingledata(name);
		return new  ResponseEntity<Employee>(e1,HttpStatus.OK);
		
	}
}
