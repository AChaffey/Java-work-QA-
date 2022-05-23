package com.qa.jdbcconnector;

import java.sql.SQLException;

import com.qa.jdbcconnector.dao.PersonDAO;
import com.qa.jdbcconnector.models.Person;

public class Runner {

	public static void main(String[] args) {
		

		PersonDAO personTable = new PersonDAO();
		
		try {
			personTable.create("Albert", "Gonzalez");

			personTable.readAll();
			
			personTable.closeResources();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}