package com.revature.service;

import java.util.List;

import com.revature.models.Planet;
import com.revature.repo.PlanetDAO;

public class PlanetServiceImpl implements PlanetService {
	
	private PlanetDAO pDao;

	public PlanetServiceImpl(PlanetDAO pDao2) {
		this.pDao = pDao2;
	}

	@Override
	public List<Planet> getPlanets() {
	
		List<Planet> planetList = pDao.selectAllPlanets();
		
		return planetList;
	}

	@Override
	public List<Planet> getBigPlanets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Planet getPlanetByName(String name) {

		return pDao.selectPlanetByName(name);
	}

	@Override
	public boolean insertPlanetByName(String name) {

		pDao.insertPlanet(new Planet(0,name));
		
		return true;
	}

	@Override
	public void updatePlanetName(String oldName, String newName) {


		Planet p = getPlanetByName(oldName); //we get a fully fleshed out object from the db, with just the name
		
		pDao.updateName(p, newName); // update the name 
		
	}

}
