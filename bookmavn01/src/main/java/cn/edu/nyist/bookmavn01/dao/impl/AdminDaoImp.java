package cn.edu.nyist.bookmavn01.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.nyist.bookmavn01.dao.AdminDao;
import cn.edu.nyist.bookmavn01.util.c3p0Util;

public class AdminDaoImp implements AdminDao {

	@Override
	public Boolean get(String name, String pwd) {
			Connection conn=null;
			PreparedStatement stmt =null;
			ResultSet re=null;
			Boolean result =false;
			try {
				conn=c3p0Util.getConn();
				String sql="select * from t_admin where name=? and pwd=?";
				stmt=conn.prepareStatement(sql);
				stmt.setString(1, name);
				stmt.setString(2, pwd);
				re=stmt.executeQuery();
				if(re.next()) {
					result=true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				c3p0Util.free(re,stmt,conn);
			}
			return result;
	}

}
