package com.flp.ems.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.omg.Messaging.SyncScopeHelper;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;

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
		
		if(!hsetKin_id.contains((String)hmap.get(5)))
			hsetKin_id.add((String)hmap.get(5));
			else
			{System.out.println("Kin_id already exist");return false;}
			
		
		Employee emp=new Employee();
		emp.setName((String)hmap.get(1));
		emp.setDate_of_birth((String)hmap.get(2));
		emp.setEmail_id((String)hmap.get(3));
		emp.setPhone_no((String)hmap.get(4));
		emp.setKin_id((String)hmap.get(5));

		
		
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
	public void SearchEmployee(String Kin_id) {
		// TODO Auto-generated method stub
		EmployeeDaoImplForList empdaolist=new EmployeeDaoImplForList();
		empdaolist.SearchEmployee(Kin_id);
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		EmployeeDaoImplForList empdaolist=new EmployeeDaoImplForList();
		empdaolist.getAllEmployee();
		
		
	}
	
	
}
