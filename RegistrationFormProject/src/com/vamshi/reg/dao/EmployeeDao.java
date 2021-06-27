package com.vamshi.reg.dao;

import java.sql.*;

import com.vamshi.reg.model.Employee;

public class EmployeeDao {

	public void registerEmployee(Employee employee) throws  ClassNotFoundException{
		System.out.println("inserting the values");
		String sql = "INSERT INTO employee"+"(id,firstname,lastname,username,password,address,contact) VALUES"+"(?,?,?,?,?,?,?);";
		
		String url = "jdbc:mysql://localhost:3306/employees";
		String Username = "root";
		String password = "Vamshi@143";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, Username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, 1);
			st.setString(2, employee.getFirstname());
			st.setString(3, employee.getLastname());
			st.setString(4, employee.getUsername());
			st.setString(5, employee.getPassword());
			st.setString(6, employee.getAddress());
			st.setString(7, employee.getContact());

			System.out.println("the values");

			System.out.println(st);

			int result = st.executeUpdate();
			System.out.println("inserted into tables");
			System.out.println(result + "rows affected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
