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

}
