package com.jspider.jdbc_simple_crud_opertion.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsertController {
	public static void main(String[] args) {

		// step-1 load/register Driver
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 Create Connection
			String url = "jdbc:mysql://localhost:3306/jffsrd-m3";
			String user = "root";
			String pass = "R@el11042000";
 
			connection = DriverManager.getConnection(url, user, pass);

			// step-3 create statement
			Statement statement = connection.createStatement();
			// step-4 executeeQuery

			String insertStudentQuery = "insert into student (id,name,email,phone) values(432,'khan','khan@29897',8676967676123)";

			statement.execute(insertStudentQuery);
			System.out.println("++++++++Data-------Stored+++++++++");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
