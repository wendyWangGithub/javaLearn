package com.test.mysql;

import java.sql.Connection;
import java.sql.*;

public class MysqlConect {

	private String driver = "com.mysql.jdbc.Driver";;
	private String url = "jdbc:mysql://localhost:3306/test";;
	private String name = "root";
	private String password = "Jsbwm0808";;
	Connection conn;
	Statement sta;
	PreparedStatement prepare;
	
	public Connection getConnection() throws Exception {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,name,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void closeConn() {
		try {
			if(this.conn != null) {
				this.conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
