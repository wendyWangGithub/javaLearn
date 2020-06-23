package com.test.mysql;

import java.sql.PreparedStatement;
import java.sql.Connection;

public class DatabaseTransaction {

	public static void main(String[] args) throws Exception{
		Connection conn = null;
		PreparedStatement state = null;
		MysqlConect mysqlConnect = new MysqlConect();
		try{
			conn = mysqlConnect.getConnection();
			String sql1 = "update tt set b=100 where a=28";
			String sql2 = "update tt set b=100 where a=38";
			conn.setAutoCommit(false);
			state = conn.prepareStatement(sql1);
			state.executeUpdate("update tt set b=100 where a=28");
			state = conn.prepareStatement(sql2);
			state.executeUpdate("update tt set b=100 where a=38");
			conn.commit();
			conn.setAutoCommit(true);
		}catch(Exception e){
			conn.rollback();
			e.printStackTrace();
		}finally{
			mysqlConnect.closeConn();
			if(state != null) {
				state.close();
			}
		}
	}
}
	