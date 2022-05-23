package com.qa.jdbcconnector.dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;
	import com.qa.jdbcconnector.models.Person;
	
public class PersonDAO {

		private static String USERNAME = "root";
		private static String PASSWORD = "root";
		private static final String URL = "jdbc:mysql://localhost:3306/jdb?serverTimezone=UTC";
		
		private static Connection connection; 
		private static PreparedStatement statement;
		
		public PersonDAO() {
			
		}
		
	
		public Person mapToPerson(ResultSet rs) throws SQLException {
			Person Person = new Person();
			
			Person.setId(rs.getInt(1));
			Person.setFirstname(rs.getString(2));
			Person.setSurname(rs.getString(3));
			
			return Person;
		}
		
		
		public void create(String firstName, String surname) throws SQLException {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement("INSERT INTO persons(first_name, surname) VALUES (?, ?)");
			
			statement.setString(1, firstName);
			statement.setString(2, surname);
			
			statement.execute();
			
		}
		
		public void readAll() throws SQLException {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement("SELECT * FROM persons");
			
			ResultSet result = statement.executeQuery();
			
			List<Person> myPersons = new ArrayList<Person>();
			
			while(result.next()) {
				myPersons.add(mapToPerson(result));
			}
			for (Person c : myPersons) {
				System.out.println(c);
			}
		}
		
	
		public void update(int id, Person cust) throws SQLException {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement("UPDATE persons SET first_name=?, surname=? WHERE id=?");
			
			statement.setString(1, cust.getFirstname());
			statement.setString(2, cust.getSurname());
			statement.setInt(3, id);
			
			statement.execute();
		}
	
		public void delete(int id) throws SQLException {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			statement = connection.prepareStatement("DELETE FROM persons WHERE id=?");
			
			statement.setInt(1, id);
			
			statement.execute();
		}
		
		public void closeResources() throws SQLException {
			PersonDAO.connection.close();
			PersonDAO.statement.close();
		}
	}
