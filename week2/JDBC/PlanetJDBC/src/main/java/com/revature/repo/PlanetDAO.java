package com.revature.repo;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDAO {
	
	/*
	 * DAO: 
	 * 	Data Access Object 
	 * 	It's a design pattern to abstract away the process of executing CRUD operations with the database. 
	 * 	DAO Class will define a Create, Read, Update, Delete 
	 */

	//CREATE
	void insertPlanet(Planet p);
	
	//READ
	List<Planet> selectAllPlanets();
	Planet selectPlanetByName(String name);

	//UPDATE 
	void updatePlanet(Planet p);
	void updateName(Planet p, String name);
	
	//DELETE
	void deletePlanet(Planet p);
}
