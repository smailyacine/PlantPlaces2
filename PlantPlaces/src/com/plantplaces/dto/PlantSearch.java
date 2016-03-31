package com.plantplaces.dto;


import javax.annotation.ManagedBean;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;


@Named
@ManagedBean
@Scope("session")
public class PlantSearch {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}