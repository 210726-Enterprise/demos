package com.revature.collections;

public class Animal {
	
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Animal other = (Animal) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
//	
	

//	@Override
//	public String toString() {
//		return "Animal [name=" + name + ", age=" + age + "]";
//	}
	
	// eventually, I'm going to Override the hashcode() and equals() method....but not right now
	

	
}
