package com.revature.proxy;

// Let's pretend this class and its interface comes from some other JAR (someone else's library)
// we can't edit this code
public class Man implements Person {

	private String name;
	private int age;
	private String city;
	private String country;

	public Man(String name, int age, String city, String country) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.country = country;
	}

	@Override
	public void introduce(String name) {
		// we want to alter the behavior of these methods...but how do we do that
		System.out.println("My name is " + this.name);
	}

	@Override
	public void sayAge(int age) {
		System.out.println("I am " + this.age + " years old");
	}

	@Override
	public void sayWhereFrom(String city, String country) {

		System.out.println("I'm from " + this.city + ", " + this.country);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
