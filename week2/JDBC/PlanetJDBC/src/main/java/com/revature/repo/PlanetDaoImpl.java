package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Planet;
import com.revature.util.ConnectionFactory;

public class PlanetDaoImpl implements PlanetDAO {

	@Override
	public void insertPlanet(Planet p) {
		
		Connection connection = ConnectionFactory.getConnection();
		
		//We are NOT going to use the Statment Interface. 
		// It's pretty terrible to use and also susceptible to SQL injections. 
		// a poor example of sql injection is "Timmy Drop Student_Table;"
		
		String sql = "INSERT INTO planets (planet_name) values (?)";
		
		PreparedStatement ps;
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, p.getName());
			
			ps.execute();
			
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	@Override
	public List<Planet> selectAllPlanets() {
		
		Connection connection = ConnectionFactory.getConnection();
		
		List<Planet> planetList = new ArrayList<>();
		
		//We define a query string
		String sql = "SELECT * FROM planets";
		
		//We create a statement object for JDBC to execute queries with 
		Statement s;
		try {
			s = connection.createStatement();
			
			//We execute said query and get the results back as a result set 
			ResultSet rs = s.executeQuery(sql);
			
			while(rs.next()) { //while the result set has values in it
				
				planetList.add(
						new Planet(
								rs.getInt(1),
								rs.getString(2)
								)
						
						);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return planetList;
	}

	@Override
	public Planet selectPlanetByName(String name) {
		
		String sql = "SELECT * FROM planets WHERE planet_name = ?;";
		
		Planet planet = null;
		
		
		try(Connection connection = ConnectionFactory.getConnection()){
			// try with resources looks like try with paraenthsis. 
			// What's unique about this, is that the connection is automatically closed once we're out of the 
			// try/catch block. 
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				planet = new Planet(rs.getInt("planet_id"), rs.getString("planet_name"));
			}
			
			// moonDao.getMoonByPlanetName(p.getNAme);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return planet;
	}

	@Override
	public void updatePlanet(Planet p) {
	

	}

	@Override
	public void updateName(Planet p, String name) {
		
		String sql = "UPDATE planets SET planet_name = ? where planet_id = ?;";
		
		
		
		try(Connection connection = ConnectionFactory.getConnection()){
			// try with resources looks like try with paraenthsis. 
			// What's unique about this, is that the connection is automatically closed once we're out of the 
			// try/catch block. 
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, p.getId());
			
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deletePlanet(Planet p) {
		// TODO Auto-generated method stub

	}

}
