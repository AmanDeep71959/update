package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {
	
	
	static ArrayList<Employee> arrlist=new ArrayList<Employee>();
	
	public void AddEmployee(Employee e){
		arrlist.add(e);
		System.out.println("Employee added");
		
	}
	public void ModifyEmployee( String Kin_id,int action,String input){
		Employee e=null;
		for(Employee emp:arrlist)
		{
			if(emp.equals(Kin_id))
				e=emp;
		}
		if(e!=null && action==1){
			e.setName(input);
			System.out.println("Name Modified");
		}
		else if(e!=null && action==2){
			e.setDate_of_birth(input);
			System.out.println(" Date of birth Modified");
		}
		else if(e!=null && action==3){
			e.setPhone_no(input);
			System.out.println(" Phone no Modified");
		}
		
		
		
		
	}
	public void RemoveEmployee(String Kin_id){
		//Iterator itr=arrlist.iterator();
		Employee e=null;
		for(Employee emp:arrlist)
		{
			if(emp.equals(Kin_id))
				e=emp;
		}
		if(e!=null)
		{arrlist.remove(e);
		System.out.println("Employee Removed");}		
	}
		
	public void SearchEmployee(String search)
	{
		//Employee e=null;
		for(Employee emp:arrlist)
		{	 
			String temp1=emp.getEmail_id();
			String temp2=emp.getKin_id();
			String temp3=emp.getName();
			if(temp1.equals(search)|| temp2.equals(search)||temp3.equals(search))
					
				//e=emp;
				System.out.println(emp);
		}
			//if(e!=null)
			//System.out.println(e);
		}
	
	public void getAllEmployee()
	{
		for(Employee emp:arrlist)
		{
			System.out.println(emp);
			System.out.println(emp.getDepartment());
			System.out.println(emp.getProject());
			System.out.println(emp.getRole());
		}
		
	}

	
}
