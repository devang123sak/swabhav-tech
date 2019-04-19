package com.techlab.departmentRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Department;

public class DepartmentRepository {
	List<Department> departmentList = new ArrayList<Department>();

	public boolean addDepartment(Department dept) {

		if (!(dept == null)) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
				PreparedStatement stmt = con.prepareStatement("INSERT INTO DEPT VALUES(?,?,?)");
				stmt.setString(1, dept.getDeptNo());
				stmt.setString(2, dept.getdName());
				stmt.setString(3, dept.getLoc());
				stmt.executeUpdate();
				con.close();
				System.out.println("Data successfully added");
				return true;
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public List<Department> getList() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			PreparedStatement stmt = con.prepareStatement(" select * from dept");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String deptNo = rs.getString("DEPTNO");
				String dName = rs.getString("DNAME");
				String loc = rs.getString("LOC");
				Department addDept = new Department(deptNo, dName, loc);
				departmentList.add(addDept);
			}
			con.close();
			rs.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return departmentList;
	}

	public void deleteDept(String deptNo) {
		try {
//		Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			String sql = "DELETE FROM dept WHERE DEPTNO = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, deptNo);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateDept(String deptNo) {
		try {
//		Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			String sql = "UPDATE  FROM dept WHERE DEPTNO = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, deptNo);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Department getDeptNo(int deptNo) {
		ResultSet rs;
		PreparedStatement pstmt;
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav", "root", "root");
			String query = "select DEPTNO, DNAME, LOC from dept where deptno =?";

			pstmt = conn.prepareStatement(query); // create a statement
			pstmt.setInt(1, deptNo); // set input parameter
			rs = pstmt.executeQuery();
//		      System.out.println("rs="+rs);
			// extract data from the ResultSet
			while (rs.next()) {
				String dbDeptNumber = rs.getString("DEPTNO");
				String dbDeptName = rs.getString(2);
				String dbDeptLocation = rs.getString(3);
				System.out.println(dbDeptNumber + "\t" + dbDeptName + "\t" + dbDeptLocation);
				return new Department(dbDeptNumber, dbDeptName, dbDeptLocation);
			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return null;
	}

}
