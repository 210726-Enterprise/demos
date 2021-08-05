package com.revature;

import com.revature.presentation.PlanetPresentation;
import com.revature.presentation.PlanetPresentationImpl;
import com.revature.repo.PlanetDAO;
import com.revature.repo.PlanetDaoImpl;
import com.revature.service.PlanetService;
import com.revature.service.PlanetServiceImpl;

public class MainDriver {
	
	public static void main(String[] args) {
		
		PlanetDAO pDao = new PlanetDaoImpl();
		PlanetService pService = new PlanetServiceImpl(pDao);
		PlanetPresentation pPresentation = new PlanetPresentationImpl(pService);
		
		pPresentation.displayPlanetsPretty();
		
//		pPresentation.initalMenu();
		
		

	}

}
