package cn.edu.nyist.bookmavn01.biz.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.nyist.bookmavn01.biz.AdminBiz;
import cn.edu.nyist.bookmavn01.dao.AdminDao;
import cn.edu.nyist.bookmavn01.dao.impl.AdminDaoImp;
import cn.edu.nyist.bookmavn01.util.c3p0Util;
//ÒµÎñ²ã
public class AdminBizImpl implements AdminBiz {

	@Override
	public Boolean findAdminByNameAndPwd(String name, String pwd) {
		AdminDao admindao= new AdminDaoImp();
		return admindao.get(name,pwd);
	}

	
}
