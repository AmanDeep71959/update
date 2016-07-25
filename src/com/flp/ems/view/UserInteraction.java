package com.flp.ems.view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.SwingUtilities;

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
		{System.out.println("Invalid Name");return false;}
		
		//Kin_id Input
		System.out.println("Enter the kin_id(alphanumeric and specialchar( _ ))");
		String Kin_id=s.next();
		if(Validate.validateKin_id(Kin_id))
			hmap.put(2,Kin_id);
		else
		{System.out.println("Invalid Kin_id");return false;}
		
		//Email_id input
		System.out.println("Enter the Email_id");
		String Email_id=s.next();
		if(Validate.validateemail_id(Email_id))
			hmap.put(3,Email_id);
		else
		{System.out.println("Enter a valid email id");return false;}
		
		//Phone_no Input
		System.out.println("Enter the phone number() ");
		String phone_no=s.next();
		if(Validate.validatePhone_no(phone_no))
			hmap.put(4,phone_no);
		else
		{System.out.println("Enter a correct phone no");
		return false;}
		
		//Date of Birth Input
		System.out.println("Enter the Date Of Birth(d-M-y format)");
		String Date=s.next();
		if(Validate.validateDate_of_birth(Date))
			hmap.put(5,Date);
		else
			{System.out.println("Invalid Date of birth");return false;}
	
		//Date of Joining Input
		System.out.println("Enter the Date Of Joining(d-M-y format)");
		String Doj=s.next();
		if(Validate.validateDate_of_Joining(Doj))
			hmap.put(6,Doj);
		else
			{System.out.println("Invalid Date of joining");return false;}
		
		//Address Input
		System.out.println("Enter the Address(only alphanumeric and special char(- ,))");
		String address=s.next();
		if(Validate.validateaddress(address))
			hmap.put(7,address);
		else
			{System.out.println("Invalid Address");return false;}
		
		//Department_id Input
		System.out.println("Select the Department number");
		System.out.println("1-FS             2-Non-FS    ");
		int Department_id=s.nextInt();
		if(Validate.validateDepartment_id(Department_id))
			hmap.put(8,Department_id);
		else
			{System.out.println("Enter the valid Department Number");return false;}
		
		//Project_id Input
		System.out.println("select the project number");
		int Project_id;
		switch(Department_id)
		{
		case 1:
			System.out.println("50- java    51-Python ");
			Project_id=s.nextInt();
			if(Validate.validateProject_id(Project_id))
			hmap.put(9,Project_id);
			else
			{System.out.println("Invalid Project No.");return false;}
			break;
		case 2:
			System.out.println("52- scala    53-html");
			Project_id=s.nextInt();
			if(Validate.validateProject_id(Project_id))
			hmap.put(9,Project_id);
			else
			{System.out.println("Invalid Project No.");return false;}
			break;
		}
	
		System.out.println("select the role number");
		System.out.println("100- developer    101-Tester    102-Database  103-Maintainence ");
		int role_id=s.nextInt();
		if(Validate.validateRole_id(role_id))
		hmap.put(10,role_id);
		else
		{System.out.println("Invalid Role No");return false;}

		
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.AddEmployee(hmap);
		s.close();
		return true;	
}
	public static void ModifyEmployee()
	{
	 System.out.println("Enter the employee Kin_id to modify");
	 	Scanner s=new Scanner(System.in);
		String Kin_id=s.next();
		 System.out.println("1-Name 2-Date_of_Birth 3-Phone no ");
		 int input=s.nextInt();
		 EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		 switch(input)
		 {
		 case 1:{System.out.println("Enter the Name");
		 		String Name=s.next();
		 		empsvc.ModifyEmployee(Kin_id,input,Name);break;}
		 case 2:{System.out.println("Enter the Date of birth");
		 		String Dob=s.next();
		 		empsvc.ModifyEmployee(Kin_id,input,Dob);break;}
		 case 3:{System.out.println("Enter the Phone no");
	 			String Phone_no=s.next();
	 			empsvc.ModifyEmployee(Kin_id,input,Phone_no);break;}
		 case 4:{System.out.println("");
			 
		 }
		 default:
			 	System.out.println("Invalid Input");break;
		 }
		 s.close();
		 }
	
	public static void RemoveEmployee()
	{
		System.out.println("Enter the kin_id to remove employee");
		Scanner s=new Scanner(System.in);
		String Kin_id=s.next();
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.RemoveEmployee(Kin_id);
		s.close();
	
	}
	
	public static void SearchEmployee(){
		
		System.out.println("SEARCH BY EMAIL OR KIN_ID");
		System.out.println("1------BY EMAIL");
		System.out.println("2------BY KINID");
		System.out.println("3------BY NAME");
		Scanner s=new Scanner(System.in);
		int choice = s.nextInt();
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		switch (choice) {
		case 1:System.out.println("ENTER THE EMAIL ID");
			String email = s.next();
			empsvc.SearchEmployee(email);
			break;
		case 2:System.out.println("ENTER THE KINID ");
			String kinid  = s.next();
			empsvc.SearchEmployee(kinid );
			break;
		case 3:System.out.println("ENTER THE NAME ");
		   	String name = s.next();
		   	empsvc.SearchEmployee(name );
		    break;
		default:
			System.out.println("Invalid Input");
		}
			s.close();
	}
	
	public static void GetAllEmployee(){
		System.out.println("All Employee list");
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl();
		empsvc.getAllEmployee();
	}
	
}
