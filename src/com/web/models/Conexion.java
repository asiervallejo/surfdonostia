package com.web.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	public static Connection conn() {
		Connection dm=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dm = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surfdonostia", "root", "");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return dm;
		
	}

}
