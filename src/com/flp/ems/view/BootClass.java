package com.flp.ems.view;
import java.util.Scanner;
public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Management System");
		
		//user view
		while(true)
		{
		System.out.println("1-Create Employee");
		System.out.println("2-Search Employee");
		System.out.println("3-Modify Employee");
		System.out.println("4-Remove Employee");
		System.out.println("5-GetAllEmployee");
		System.out.println("6-To Exit");
		//user input
		System.out.println("Enter the action");
		Scanner s=new Scanner(System.in);
		int userinput=s.nextInt();
		if(userinput==6){break;}
		
		
		menuSelection(userinput);

		}
	}
	
	
	public static void menuSelection(int userinput){
		
		switch(userinput)
		{ 
		case 1:UserInteraction.AddEmployee();break;
		case 2:UserInteraction.SearchEmployee();break;
		case 3:UserInteraction.ModifyEmployee();break;
		case 4:UserInteraction.RemoveEmployee();break;
		case 5:UserInteraction.GetAllEmployee();break;
		default:System.out.println("invalid input");break;
		}
		}
	}
	

