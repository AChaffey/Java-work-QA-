package com.qa.springbootexample.domain;


import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id // this will be the PRIMARY KEY- Unique and NOT NULL,
	@GeneratedValue(strategy = GenerationType.IDENTITY) // This will allow it to auto increment.
	private long id;
	
	@Column (name = "firstname", nullable=false) // can override the column, and also add constraints like NOT NULL
	private String firstName; // defaults to first_Name
	
	@Column (nullable = false)
	private String lastName; // defaults to last_Name
	
	@Column (nullable = false)
	private String username;// defaults to username
	
//	Default constructor - Spring uses this
	public User() {}

//	This would be used for inserting into the database
public User(String firstName, String lastName, String username) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
	}

//	This reads from the database (because all for are set)
	public User(long id, String firstName, String lastName, String username) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName, username);
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
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastName, other.lastName)
				&& Objects.equals(username, other.username);
		
	}
	
	
}