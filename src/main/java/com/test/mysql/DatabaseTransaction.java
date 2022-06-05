package com.test.mysql;

import java.sql.PreparedStatement;
import java.sql.Connection;

public class DatabaseTransaction {

	//数据库事务
	public static void main(String[] args) throws Exception{
		Connection conn = null;
		PreparedStatement state = null;
		MysqlConect mysqlConnect = new MysqlConect();
		try{
			conn = mysqlConnect.getConnection();
			String sql1 = "update tt set b=100 where a=28";
			String sql2 = "update tt set b=100 where a=38";
			conn.setAutoCommit(false);//Connection.setAutoCommit() 方法用于设置数据库连接的提交模式。如果是自动模式，执行所有的 SQL 语句，并作为单个事务被提交，否则 SQL 语句会被聚集到事务当中，直到调用 commit 方法或 rollback 方法为止。默认情况下新建连接为自动提交模式。
			state = conn.prepareStatement(sql1);
			state.executeUpdate("update tt set `name`=100 where `id`=1");
			state = conn.prepareStatement(sql2);
			state.executeUpdate("update tt set `name`=200 where `id`=2");
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
	