package com.flp.ems.view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;


public class UserInteraction {

	
	public static boolean AddEmployee()
	{
		HashMap<Integer,Object> hmap= new HashMap<Integer,Object>();
		Scanner s=new Scanner(System.in);
		
		//Name Input
		System.out.println("Enter the employee name (alphanumeric only)");
		String Name=s.next();
		if(Validate.validateName(Name))
		hmap.put(1,Name);
		else	
		{System.out.println("Invalid Input");return false;}
		
		//Kin_id Input
		System.out.println("Enter the kin_id ");
		String Kin_id=s.next();
		if(Validate.validateKin_id(Kin_id))
			hmap.put(2,Kin_id);
		else
		{System.out.println("Invalid Input");return false;}
		
		//Email_id input
		System.out.println("Enter the Email_id");
		String Email_id=s.next();
		if(Validate.validateemail_id(Email_id))
			hmap.put(3,Email_id);
		else
		{System.out.println("Invalid Input");return false;}
		
		//Phone_no Input
		System.out.println("Enter the phone number ");
		String phone_no=s.next();
		if(Validate.validatePhone_no(phone_no))
			hmap.put(4,phone_no);
		else
		{System.out.println("Invalid Input");
		return false;}
		
		//Date of Birth Input
		System.out.println("Enter the Date Of Birth(d-M-y format)");
		String Date=s.next();
		if(Validate.validateDate_of_birth(Date))
			hmap.put(5,Date);
		else
			{System.out.println("Invalid Input");return false;}
	
		//Date of Joining Input
		System.out.println("Enter the Date Of Birth(d-M-y format)");
		String Doj=s.next();
		if(Validate.validateDate_of_birth(Doj))
			hmap.put(6,Doj);
		else
			{System.out.println("Invalid Input");return false;}
		
		//Address Input
		System.out.println("Enter the Address");
		String address=s.next();
		if(Validate.validateaddress(address))
			hmap.put(7,address);
		else
			{System.out.println("Invalid Input");return false;}
		
		//Department_id Input
		System.out.println("Enter the Department_id");
		String Department_id=s.next();
		if(Validate.validateDepartment_id(Department_id))
			hmap.put(6,Doj);
		else
			{System.out.println("Invalid Input");return false;}
		
		//Project_id Input
		
		
		
		
		
		
		
		
		
		
		
		
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.AddEmployee(hmap);
		return true;
		
			
	}
	public static void ModifyEmployee()
	{
	 System.out.println("Enter the employee Kin_id to modify");
	 	Scanner s=new Scanner(System.in);
		String Kin_id=s.next();
		 System.out.println("1-Name 2-Date_of_Birth 3-Phone no 4");
		 int input=s.nextInt();
		 switch(input)
		 {
		 case 1:{System.out.println("Enter the Name");
		 		String Name=s.next();
		 		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		 		empsvc.ModifyEmployee(Kin_id,input,Name);break;}
		 case 2:{System.out.println("Enter the Date of birth");
		 		String Name=s.next();
		 		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		 		empsvc.ModifyEmployee(Kin_id,input,Name);break;}
		 case 3:{System.out.println("Enter the Phone no");
	 			String Name=s.next();
	 			EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
	 			empsvc.ModifyEmployee(Kin_id,input,Name);break;}
		 default:
			 	System.out.println("Invalid Input");break;
		 }
		 }
	
	public static void RemoveEmployee()
	{
		System.out.println("Enter the kin_id to remove employee");
		Scanner s=new Scanner(System.in);
		String Kin_id=s.next();
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.RemoveEmployee(Kin_id);
	
	}
	
	public static void SearchEmployee(){
		System.out.println("Enter the Kin_id to search");
		Scanner s=new Scanner(System.in);
		String Kin_id=s.next();
	
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.SearchEmployee(Kin_id);
		
	}
	
	public static void GetAllEmployee(){
		System.out.println("All Employee list");
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.getAllEmployee();
	}
	
}
