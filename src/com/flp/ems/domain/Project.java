package com.flp.ems.domain;

public class Project {
	
	//member variables
	private int Project_id;
	private String Name;
	private String Description;
	private int Department_id;
	
	
	
//getter and setter methods
	

public int getProject_id() {
	return Project_id;
}
@Override
public String toString() {
	return "Project [Name=" + Name + ", Description=" + Description + "]";
}
public void setProject_id(int project_id) {
	Project_id = project_id;
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}

public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}

public int getDepartment_id() {
	return Department_id;
}
public void setDepartment_id(int department_id) {
	Department_id = department_id;
}

}
