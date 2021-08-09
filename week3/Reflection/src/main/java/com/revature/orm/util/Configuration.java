package com.revature.orm.util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Configuration {
	
	private String dbUrl;
	private String dbUsername;
	private String dbPassword;
	private List<Metamodel<Class<?>>> metamodelList;
	
	public Configuration addAnnotatedClass(Class annotatedClass) {
			
		if(metamodelList == null) {
			metamodelList = new LinkedList<>();	
		}
		
		// generate a method in metamodel that transforms a class into an appropriate data model to be
		// transposed into a relation db object
		metamodelList.add(Metamodel.of(annotatedClass));
		
		return this; // we're returning the 	
	}
	
	public List<Metamodel<Class<?>>> getMetamodels() {
		
		return (metamodelList == null) ? Collections.emptyList() : metamodelList;
	}

}
