package com.flp.ems.domain;
import java.util.Date;;

public class Employee {
	//member variables 
  private static int Employee_id=0;
  private String Name;
  private String Kin_id;
  private String Email_id;
  private String Phone_no;
  private String Date_of_birth;
  private String Date_of_Joining;
  private String Address;
  private int Department_id;
  private int Project_id;
  private int Role_id;
  Department department;
  Project project;
  Role role;
  
  //constructors
  public Employee() {
		Employee_id++;
	}
  
	@Override
public String toString() {
	return "Employee [Name=" + Name + ", Kin_id=" + Kin_id + ", Email_id=" + Email_id + ", Phone_no=" + Phone_no
			+ ", Date_of_birth=" + Date_of_birth + ", Date_of_Joining=" + Date_of_Joining + ", Address=" + Address
			+ ", Department_id=" + Department_id + ", Project_id=" + Project_id + ", Role_id=" + Role_id + "]";
}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Project getProject() {
		return project;
	}
	
	public void setProject(Project project) {
		this.project = project;
	}
	
	
	public Role getRole() {
		return role;
	}
	
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email_id == null) ? 0 : Email_id.hashCode());
		result = prime * result + ((Kin_id == null) ? 0 : Kin_id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object search) {
		if(this.Kin_id.equals(search)| this.Email_id.equals(search) | this.Name.equals(search))
			return true;
		else 
			return false;
	}
	  
	  
	public static int getEmployee_id() {
		return Employee_id;
	}
	
	
	public String getName() {
		return Name;
	}
	
	
	public void setName(String name) {
		Name = name;
	}
	
	
	public String getKin_id() {
		return Kin_id;
	}
	
	
	public void setKin_id(String kin_id) {
		Kin_id = kin_id;
	}
	
	
	public String getEmail_id() {
		return Email_id;
	}
	
	
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	
	
	public String getPhone_no() {
		return Phone_no;
	}
	
	
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	
	
	public String getDate_of_birth() {
		return Date_of_birth;
	}
	
	
	public void setDate_of_birth(String date_of_birth) {
		Date_of_birth = date_of_birth;
	}
	
	
	public String getDate_of_Joining() {
		return Date_of_Joining;
	}
	
	
	public void setDate_of_Joining(String date_of_Joining) {
		Date_of_Joining = date_of_Joining;
	}
	
	
	public String getAddress() {
		return Address;
	}
	
	
	public void setAddress(String address) {
		Address = address;
	}
	
	
	public int getDepartment_id() {
		return Department_id;
	}
	
	
	public void setDepartment_id(int department_id) {
		Department_id = department_id;
	}
	
	
	public int getProject_id() {
		return Project_id;
	}
	
	
	public void setProject_id(int project_id) {
		Project_id = project_id;
	}
	
	public int getRole_id() {
		return Role_id;
	}
	
	public void setRole_id(int roles_id) {
		Role_id = roles_id;
	}
	



  
  }
  
