package com.revature;

import java.util.Objects;

public class Planet {
	
	private String planetName;
	private int planetId;
	
	
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(String planetName, int planetId) {
		super();
		this.planetName = planetName;
		this.planetId = planetId;
	}
	public String getPlanetName() {
		return planetName;
	}
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	public int getPlanetId() {
		return planetId;
	}
	public void setPlanetId(int planetId) {
		this.planetId = planetId;
	}
	@Override
	public String toString() {
		return "Planet [planetName=" + planetName + ", planetId=" + planetId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(planetId, planetName);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		return planetId == other.planetId && Objects.equals(planetName, other.planetName);
	}
	
	
	
	

}
