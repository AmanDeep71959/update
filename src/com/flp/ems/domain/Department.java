package com.flp.ems.domain;

public class Department {

int Department_id;
String Name;
String Description;



@Override
public String toString() {
	return "Department [Department_Name=" + Name + ",Description=" + Description + "]";
}
public int getDepartment_id() {
	return Department_id;
}
public void setDepartment_id(int department_id) {
	Department_id = department_id;
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




}
