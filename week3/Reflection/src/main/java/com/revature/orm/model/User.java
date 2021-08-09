package com.revature.orm.model;

import java.io.Serializable;

import com.revature.orm.annotations.Column;
import com.revature.orm.annotations.Entity;
import com.revature.orm.annotations.Id;
import com.revature.orm.annotations.JoinColumn;

// this class will be referred to as an ENTITY in our database
@Entity(tableName = "users")
public class User implements Serializable {

	@Id(columnName = "id")
	private int id;
	
	@Column(columnName = "first_name")
	private String firstname;
	
	@Column(columnName = "last_name")
	private String lastname;
	
	@Column(columnName = "email_address")
	private String emailadress;
	
	@JoinColumn(columnName = "test_relation")
	private Test testRelation; // if this represents foreign key 
	
	public User() {
		super();
	}

	public User(int id, String firstname, String lastname, String emailadress, Test testRelation) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailadress = emailadress;
		this.testRelation = testRelation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailadress() {
		return emailadress;
	}

	public void setEmailadress(String emailadress) {
		this.emailadress = emailadress;
	}

	public Test getTestRelation() {
		return testRelation;
	}

	public void setTestRelation(Test testRelation) {
		this.testRelation = testRelation;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailadress=" + emailadress
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailadress == null) ? 0 : emailadress.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (emailadress == null) {
			if (other.emailadress != null)
				return false;
		} else if (!emailadress.equals(other.emailadress))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (id != other.id)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	
	

}
