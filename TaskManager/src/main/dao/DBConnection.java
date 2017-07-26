package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public Connection getConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn;
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TaskManager?autoReconnect=true&useSSL=false", "root", "root");
				return conn;
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
		
		
		
	}

}
