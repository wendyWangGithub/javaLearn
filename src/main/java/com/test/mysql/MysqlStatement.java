package com.test.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MysqlStatement {

	public static void main(String[] args) throws Exception {
		Connection conn;
		PreparedStatement state = null;
		Long start = System.currentTimeMillis();
		MysqlConect connection = new MysqlConect();
		try {
			conn = connection.getConnection();
			for (int i=0; i<10; i++) {
				String sql = "insert into tt values(null, '"+i+"')";
				state = conn.prepareStatement(sql);
				state.executeUpdate();
			}
			Long end = System.currentTimeMillis();
			System.out.println("使用Statement费时:" + (end -start));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.closeConn();
			if(state != null) {
				state.close();
			}
		}
	}
}
