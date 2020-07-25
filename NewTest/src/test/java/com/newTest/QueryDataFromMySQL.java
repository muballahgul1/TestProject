package com.newTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDataFromMySQL {

	public static void main(String[] args) throws Exception, Exception, Exception {
		Connection con=null;
		try {
			con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/automationtesting","root","root");
			if (con!=null) 
			{
				System.out.println("connection successful");
			}
		} catch (SQLException e) {
			System.out.println("connection fail");
			e.printStackTrace();
		}
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM automationtesting.cradential");
		while (rs.next()) {
			System.out.println("UserName:"+rs.getString("UserName"));
			
		}
		rs.close();
		} 
		

	}


