package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainDriver {
	
	
	private static final String URL = "jdbc:postgresql://localhost/postgres"; // "jdbc:postgresql://[ENDPOINT]/[DATABASE]"
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "p4ssw0rd";
	
	private static Connection connection;

	public static void main(String[] args) {
		
		
		try {
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			List<Planet> planetList = new ArrayList<>();
			
			//We define a query string
			String sql = "SELECT * FROM planets";
			
			//We create a statement object for JDBC to execute queries with 
			Statement s = connection.createStatement();
			
			//We execute said query and get the results back as a result set 
			ResultSet rs = s.executeQuery(sql);
			
			while(rs.next()) { //while the result set has values in it
				
				planetList.add(
						new Planet(
								rs.getString(2),
								rs.getInt(1)
								)
						
						);
				
			}
			
			System.out.println(planetList);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 * 
		 * JDBC - Java Database Connection 
		 * 
		 * JDBC API handles databases using Java, allows us to interact with out database. 
		 * (essentially it abstracts a lot of the code) 
		 * 
		 * Important interfaces in JDBC: 
		 * 		DriverManager: implemented by postgresql Driver to connect to our database
		 * 		Connection: Connection object represents an active connection to our db, allowing us to execute queries
		 * 		Statement : Terrible way to execute query 
		 * 		PreparedStatement : Represents a query that can be executed by our connection Object 
		 * 		CallableStatement : Used to invoke functions or stored procedures. 
		 * 
		 */
		
		/*
		 * What do I need to connect to my database?
		 * 	username 
		 * 	password
		 * 	endpoint 
		 */
		
		
		
		

	}

}
