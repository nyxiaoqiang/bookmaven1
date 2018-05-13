package cn.edu.nyist.bookmavn01.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Driver;

public class c3p0Util {
	private static ComboPooledDataSource cpds = new ComboPooledDataSource();

	public static Connection getConn() {
		Connection conn = null;
		try {
			DriverManager.registerDriver(new Driver());
			conn = cpds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void free(ResultSet re, Statement stmt, Connection conn) {

		if (re != null) {
			try {
				re.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
