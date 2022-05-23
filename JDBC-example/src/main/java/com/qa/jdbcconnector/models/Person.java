package com.qa.jdbcconnector.models;

public class Person {


		private int id;
		private String firstname;
		private String surname;
		
		
		
		public Person(int id, String firstname, String surname) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.surname = surname;
		}


		public Person(String firstname, String surname) {
			super();
			this.firstname = firstname;
			this.surname = surname;
		}


		public Person() {
			super();
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


		public String getSurname() {
			return surname;
		}


		public void setSurname(String surname) {
			this.surname = surname;
		}

	   
		@Override
		public String toString() {
			return "Person [id=" + id + ", firstname=" + firstname + ", surname=" + surname + "]";
		}

	 
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
			result = prime * result + id;
			result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
			Person other = (Person) obj;
			if (firstname == null) {
				if (other.firstname != null)
					return false;
			} else if (!firstname.equals(other.firstname))
				return false;
			if (id != other.id)
				return false;
			if (surname == null) {
				if (other.surname != null)
					return false;
			} else if (!surname.equals(other.surname))
				return false;
			return true;
		}
		
		
		
		
	}

