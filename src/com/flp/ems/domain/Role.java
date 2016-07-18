package com.flp.ems.domain;

public class Role {
	int Role_id;
	String Name;
	
	
	
	
	
	@Override
	public String toString() {
		return "Role [Name=" + Name + ", Description=" + Description + "]";
	}
	public int getRole_id() {
		return Role_id;
	}
	public void setRole_id(int role_id) {
		Role_id = role_id;
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
	String Description;
}
