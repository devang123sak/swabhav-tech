package com.techlab.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStatement {

	public static void main(String[] args) {

	      try {
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav" , "root","root");
//	         System.out.println(con);
	         
	         Statement stmt = con.createStatement();
	         ResultSet rs = stmt.executeQuery("SELECT * FROM DEPT");
	         System.out.println("DEPTNO   DNAME  	  LOC");
	         
	         while (rs.next()) {
	        	 System.out.println(rs.getInt(1)+"	"+rs.getString(2)+"	"+rs.getString(3));
	         }
	         con.close();
	         rs.close();
	      } catch(SQLException e) {
	         System.out.println("SQL exception occured" + e);
	      }
	
	}

}
