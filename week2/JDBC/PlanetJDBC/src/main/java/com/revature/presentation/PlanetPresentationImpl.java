package com.revature.presentation;

import java.util.List;
import java.util.Scanner;

import com.revature.models.Planet;
import com.revature.service.PlanetService;

public class PlanetPresentationImpl implements PlanetPresentation {

	private PlanetService service;
	
	
	public PlanetPresentationImpl(PlanetService service) {
		super();
		this.service = service;
	}
	
	

	@Override
	public void displayPlanetsPretty() {
		
		List<Planet> planetList = service.getPlanets();
		
		System.out.println("Here's a list of all the planets:");
		
		for(Planet p: planetList) {
			System.out.println("Planet name: " + p.getName());
		}
		

	}

	@Override
	public void initalMenu() {

		System.out.println("Here's the inital menu!");
		
		System.out.println("Please insert in a planet!");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		service.insertPlanetByName(name);
		
		
		displayPlanetsPretty();
		
		System.out.println("Select a Planet to update");
		
		String oldName = sc.nextLine();
		
		System.out.println("Update the planet with a new name!");
		
		String newName = sc.nextLine();
		
		service.updatePlanetName(oldName, newName);
		
		displayPlanetsPretty();
		
	}

	@Override
	public void displayBigPlanets() {


			List<Planet> bigPlanetList = service.getBigPlanets();
			
			System.out.println("Here's a list of all the big planets:");
			
			for(Planet p: bigPlanetList) {
				System.out.println("Planet name: " + p.getName());
			}
		
	}
	
	

}
