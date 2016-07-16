package com.flp.ems.service;
import java.util.HashMap;
public interface IEmployeeService {

	public boolean AddEmployee(HashMap<Integer,Object> hmap);
	public void ModifyEmployee(String Kin_id,int action,String input);
	public void RemoveEmployee(String s);
	public void SearchEmployee(String s);
	public void getAllEmployee();
	
}






















