package com.plantplaces.ui;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.plantplaces.dto.PlantSearch;

@Named
@ManagedBean
@Scope("session")
public class SearchPlants {

	@Inject
	private PlantSearch plant;
	
	public String execute(){
		if(plant!=null && plant.getName().equalsIgnoreCase("Redbud")){
			return "search";
		}else{
			return "noresults";	
		}
		
	}

	public PlantSearch getPlant() {
		return plant;
	}

	public void setPlant(PlantSearch plant) {
		this.plant = plant;
	}
}
