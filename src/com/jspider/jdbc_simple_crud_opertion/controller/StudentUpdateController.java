package com.jspider.jdbc_simple_crud_opertion.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentUpdateController {
public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter student id to update email");
	int id = scanner.nextInt();
	System.out.println("enter new email to update");
	String email = scanner.next();
	try {
		//step-1 load/register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step-2 Create Connection;
		String url = "jdbc:mysql://localhost:3306/jffsrd-m3";
		String user = "root";
		String pass = "R@el11042000";         
				
				Connection connection =DriverManager.getConnection(url,user,pass);
		//step-3 create statement
		Statement statement =connection.createStatement();
		//step-4 execute query
		String updateStudentEmailQuery = "update student set email='"+email+"' WHERE id="+id;

	       int a=statement.executeUpdate(updateStudentEmailQuery);
	       if(a==1) {
	    	   System.out.println("Data----Updated-------");
	    	   
	       }else {
	    	   System.out.println("Given id is not Present");
	       } 
	       
	}catch (ClassNotFoundException | SQLException e) {
		 e.printStackTrace();
	}
	
}
	
}
