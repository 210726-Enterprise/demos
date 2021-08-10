package com.revature;

public class World implements Comparable<World> {
    private String name;
    private String terrain;
    private String system;
    private int population;
    private int numberOfMoons;

    public World() {

    }

    public World(String name){
        this.name = name;
    }

    public World(Integer numberOfMoons){
        this.numberOfMoons = numberOfMoons;
    }


    public World(String name, String terrain, String system, int population, int numberOfMoons) {
        this.name = name;
        this.terrain = terrain;
        this.system = system;
        this.population = population;
        this.numberOfMoons = numberOfMoons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    @Override
    public String toString() {
        return "World{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }


    // sorts descending
    // comparing
    // naboo , pop = 100000
    // tatooine, pop = 50000

    // tat - naboo = a negative
    @Override
    public int compareTo(World o) {
        return o.population - this.population;
    }
}
