package com.plantplaces.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.plantplaces.dao.IPlantDAO;
import com.plantplaces.dto.Plant;

@Named
public class PlantService implements IPlantService {

	@Inject
	IPlantDAO plantDAO;
	public IPlantDAO getPlantDAO() {
		return plantDAO;
	}

	public void setPlantDAO(IPlantDAO plantDAO) {
		this.plantDAO = plantDAO;
	}

	private List<Plant> allPlants;

	@Override
	public List<Plant> filterPlants(String filter) {

		if (allPlants == null) {
			allPlants = plantDAO.fetchPlants();
		}
		// the collection wa are returning.
		ArrayList<Plant> returnPlants = new ArrayList<Plant>();
		// filter the list
		// interview all possible plants and move plants that contain the filter
		// text into our subset collection (returnPlants)
		for (Plant plant : allPlants) {
			if (plant.toString().contains(filter)) {
				// this plant matchs our criteria so add it to the returned
				// collection
				returnPlants.add(plant);
			}
		}

		return returnPlants;
	}

}
