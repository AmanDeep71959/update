package com.flp.ems.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.omg.Messaging.SyncScopeHelper;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public class EmployeeServiceImpl implements IEmployeeService{
	

	static HashSet<String> hsetKin_id=new HashSet<String>();
	static HashSet<String> hsetEmail_id=new HashSet<String>();
	@Override
	public boolean AddEmployee(HashMap<Integer,Object> hmap) {
		// TODO Auto-generated method stub
		
		if(!hsetEmail_id.contains((String)hmap.get(3)))
				hsetEmail_id.add((String)hmap.get(3));
			else
			{System.out.println("Email_id already exist");return false;}
		
		if(!hsetKin_id.contains((String)hmap.get(2)))
			hsetKin_id.add((String)hmap.get(2));
			else
			{System.out.println("Kin_id already exist");return false;}
			
		
		Employee emp=new Employee();
		emp.setName((String)hmap.get(1));
		emp.setKin_id((String)hmap.get(2));
		emp.setEmail_id((String)hmap.get(3));
		emp.setPhone_no((String)hmap.get(4));
		emp.setDate_of_birth((String)hmap.get(5));
		emp.setDate_of_Joining((String)hmap.get(6));
		emp.setAddress((String)hmap.get(7));
		emp.setDepartment_id((Integer)hmap.get(8));
		emp.setProject_id((Integer)hmap.get(9));
		emp.setRole_id((Integer)hmap.get(10));
		
		
		Department dept=new Department();
		emp.setDepartment(dept);
		
		switch(emp.getDepartment_id())
		{
			case 1:
				emp.getDepartment().setDepartment_id((Integer)hmap.get(8));
				emp.getDepartment().setName("Financial Services");
				emp.getDepartment().setDescription("Fs is important department");
				break;
			case 2:
				emp.getDepartment().setDepartment_id((Integer)hmap.get(8));
				emp.getDepartment().setName("Non Financial Services");
				emp.getDepartment().setDescription("NFs is important department");
				break;
		}
		
		
		Project proj=new Project();
		emp.setProject(proj);
		switch(emp.getProject_id())
		{
			case 50:
				emp.getProject().setProject_id((Integer)hmap.get(9));
				emp.getProject().setName("Java");
				emp.getProject().setDescription("Java is everywhere");
				emp.getProject().setDepartment_id((Integer)hmap.get(8));
				break;
			case 51:
				emp.getProject().setProject_id((Integer)hmap.get(9));
				emp.getProject().setName("Python");
				emp.getProject().setDescription("Python is powerful");
				emp.getProject().setDepartment_id((Integer)hmap.get(8));
				break;
			case 52:
				emp.getProject().setProject_id((Integer)hmap.get(9));
				emp.getProject().setName("Scala");
				emp.getProject().setDescription("scala is best");
				emp.getProject().setDepartment_id((Integer)hmap.get(8));
				break;
			case 53:
				emp.getProject().setProject_id((Integer)hmap.get(9));
				emp.getDepartment().setName("html");
				emp.getDepartment().setDescription("Design the page");
				emp.getProject().setDepartment_id((Integer)hmap.get(8));
				break;
		}
		
		Role role=new Role();
		emp.setRole(role);
		switch(emp.getProject_id())
		{
			case 100:
				emp.getRole().setRole_id((Integer)hmap.get(10));
				emp.getRole().setName("Developer");
				emp.getRole().setDescription("Dev");
				break;
			case 101:
				emp.getRole().setRole_id((Integer)hmap.get(10));
				emp.getRole().setName("tester");
				emp.getRole().setDescription("test");
				break;
			case 102:
				emp.getRole().setRole_id((Integer)hmap.get(10));
				emp.getRole().setName("Database");
				emp.getRole().setDescription("Data");
				break;
			case 103:
				emp.getRole().setRole_id((Integer)hmap.get(10));
				emp.getRole().setName("Maintainence");
				emp.getRole().setDescription("Maintain");
				break;
		}
		
		
		
		EmployeeDaoImplForList empdao=new EmployeeDaoImplForList();
		empdao.AddEmployee(emp);
		return true;
	}

	@Override
	public void ModifyEmployee( String Kin_id,int action,String input) {
		// TODO Auto-generated method stub
		EmployeeDaoImplForList empdao=new EmployeeDaoImplForList();
		empdao.ModifyEmployee(Kin_id,action,input);
		
	}

	@Override
	public void RemoveEmployee(String Kin_id) {
		// TODO Auto-generated method stub
		if(hsetKin_id.contains(Kin_id)){
			EmployeeDaoImplForList empdaolist=new EmployeeDaoImplForList();
			empdaolist.RemoveEmployee(Kin_id);
		}
		else
			System.out.println("This Kin_id employee does'nt exist");	
	}

	@Override
	public void SearchEmployee(String search) {
		// TODO Auto-generated method stub
		EmployeeDaoImplForList empdaolist=new EmployeeDaoImplForList();
		empdaolist.SearchEmployee(search);
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		EmployeeDaoImplForList empdaolist=new EmployeeDaoImplForList();
		empdaolist.getAllEmployee();
		
		
	}
	
	
}
