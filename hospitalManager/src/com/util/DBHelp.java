package com.util;

import java.sql.*;

public class DBHelp {

	public static Connection getConnection(){
		Connection conn = null;
		// �������ݿ��������
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;DatabaseName=yiyuan";
			String username = "sa";
			String password = "qx";
			conn = DriverManager.getConnection(url,username,password); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConn(Object o){
		if(o!=null){
			if(o instanceof Connection){
				try {
					((Connection)o).close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(o instanceof Statement){
				try {
					((Statement)o).close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(o instanceof PreparedStatement){
				try {
					((PreparedStatement)o).close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(o instanceof ResultSet){
				try {
					((ResultSet)o).close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
