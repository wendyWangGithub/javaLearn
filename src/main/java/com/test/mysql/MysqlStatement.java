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
			for (int i=0; i<2; i++) {
				String sql = "insert into tt values(null, '"+i+"')";
				state = conn.prepareStatement(sql);
				state.executeUpdate();
			}
			Long end = System.currentTimeMillis();
			System.out.println("向数据库中插入数据耗时:" + (end -start));


			System.out.println("插入的数据，大于数据库定义的容量，程序抛出异常");
			String sql = "insert into tt values(null, '大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333大于char255的值3333333333333333333333333333333333333333333333333')";
			state = conn.prepareStatement(sql);
			state.executeUpdate();

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
