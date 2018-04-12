package com.stuInfoManage.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class JDBCUtil {
	
		
	private static ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
	
	public static Connection getConnection() throws SQLException {
		
		return comboPooledDataSource.getConnection();
		
	}
	
	public static void closeJDBC(ResultSet rs,PreparedStatement ptst,Connection conn) throws SQLException {
		if(rs!=null) {
			rs.close();
		}
		if(ptst!=null) {
			ptst.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}
	
	public static void closeJDBC(PreparedStatement ptst,Connection conn) throws SQLException {
		if(ptst!=null) {
			ptst.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}
	
}
