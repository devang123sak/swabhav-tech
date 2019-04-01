package com.techlab.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestSqlInjection {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Department Number:");
			String deptNo = scan.nextLine();
			
			//get data from database and display
//			 Statement stmt = con.createStatement();
//	         ResultSet rs = stmt.executeQuery("SELECT * FROM DEPT WHERE  DEPTNO="+deptNo);
			
			
			PreparedStatement stmt=con.prepareStatement("SELECT * FROM DEPT WHERE  DEPTNO=?");//preparedStatement to prevent sql injection
			stmt.setString(1, deptNo);
			ResultSet rs = stmt.executeQuery();
	         System.out.println("DEPTNO   DNAME  	  LOC");
	         
	         while (rs.next()) {
	        	 System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"	"+rs.getString(3));
	         }
	         con.close();
	         rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
