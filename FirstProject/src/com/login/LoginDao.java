package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	
	public boolean check(String fname,String pass)
	{
		String sql="select * from login where fname=? and pass=?";
		String url="jdbc:mysql://localhost:3306/vam";
		String username="root";
		String password="Vamshi@143";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
             PreparedStatement st= con.prepareStatement(sql);
             st.setString(1,fname);
             st.setString(2,pass);
             ResultSet rs = st.executeQuery();
             if(rs.next())
             {
            	return true;
             }
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
}
