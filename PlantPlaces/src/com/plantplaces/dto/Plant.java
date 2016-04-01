package com.plantplaces.dto;


import javax.annotation.ManagedBean;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;


@Named
@ManagedBean
@Scope("session")
public class Plant {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override//we overide the tostring method of the Object class to 
	//get a more readable output 
	public String toString() {
		return name;
	}
	
	
	
}
