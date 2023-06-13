package com.cjc.main.servieImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.repository;
import com.cjc.main.service.ServiceI;

@Service
public class servieImpl implements ServiceI {

	@Autowired
	private repository repo;

	@Override
	public Employee savedata(Employee e) {
		
		Employee save = repo.save(e);
		return save;
		
	}

	@Override
	public List<Employee> getdata() {
		List<Employee> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public Employee updatedata(Employee e) {
		
		Employee save = repo.save(e);
		return save;
		
	}

	@Override
	public void deletedata(int eid) {
		repo.deleteById(eid);
		
	}

	@Override
	public Employee getsingledata(String name) {
		Employee e1=repo.findByname(name);
		return e1;
	}

	
	

	
}
