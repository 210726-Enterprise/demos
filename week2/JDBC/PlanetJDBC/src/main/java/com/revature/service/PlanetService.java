package com.revature.service;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetService {

	List<Planet> getPlanets();
	
	Planet getPlanetByName(String name);

	boolean insertPlanetByName(String name);
	
	List<Planet> getBigPlanets();
	
	void updatePlanetName(String oldName, String newName);

}
