package com.flp.ems.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {
	
	//methods
	
	public static boolean validateName(String Name)
	{    	
	if (Name.matches("[a-zA-Z0-9]+"))
			return true;
		else
			return false;
  
    }
	
	public static boolean validateKin_id(String Kin_id)
	{
        if(Kin_id.matches("[a-zA-Z0-9_]+")){
            return true;
        }
        return false;
			
	}
	
	public static boolean validatePhone_no(String Phone_no)
	{
        if(Phone_no.matches("^[0-9{2}\\+]"+"[0-9]+")){
            return true;
        }
        return false;
	}
	
	public static boolean validateemail_id(String email_id)
	{
		String str="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		if(email_id.matches(str)){
            return true;
        }
        return false;
			
	}
	
	public static boolean validateDate_of_birth(String date)
	{
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date2=null;
		try {
		    //Parsing the String
		    date2 = dateFormat.parse();
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		 System.out.println("invalid input");
		}
		System.out.println(date2);
		return true;*/
		
		 if(date.matches("^[0-9-]+")){
	            return true;
	        }
	        return false;
		
	}
	public static boolean validateDate_of_Joining(String date){
		
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date2=null;
		try {
		    //Parsing the String
		    date2 = dateFormat.parse(date);
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		 System.out.println("invalid input");
		}
		System.out.println(date2);
		return true;*/
		
		 if(date.matches("^[0-9-]+"))
	          return true;
	      return false;	
	}
	

	public static boolean validateaddress(String address){

        if(address.matches("[a-zA-Z0-9-,]+"))
            return true;
        return false;	
	}
	
	
	public static boolean validateDepartment_id(int Department_id){
		if(Department_id==1 | Department_id==2)
				return true;
		return false;
	}
	
	
	public static boolean validateProject_id(int Project_id){
			if(Project_id==50 | Project_id==51 | Project_id==52 | Project_id==53)
				return true;
			return false;
	}	
		
	public static boolean validateRole_id(int Role_id){
		int i;
		for(i=100;i<104;i++)
		{
			if(i==Role_id)
				return true;
		}
		return false;
		
	}	
	
	
}
