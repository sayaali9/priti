package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Employee;

public interface ServiceI {

	Employee savedata(Employee e);

	List<Employee> getdata();

	Employee updatedata(Employee e);

	void deletedata(int eid);

	Employee getsingledata(String name);

	

}
