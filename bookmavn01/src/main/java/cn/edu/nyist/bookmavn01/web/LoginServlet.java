package cn.edu.nyist.bookmavn01.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nyist.bookmavn01.biz.AdminBiz;
import cn.edu.nyist.bookmavn01.biz.impl.AdminBizImpl;
import cn.edu.nyist.bookmavn01.util.c3p0Util;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		//2业务层处理
		AdminBiz adminBiz= new AdminBizImpl();
		Boolean result=adminBiz.findAdminByNameAndPwd(name,pwd);
		//3.给用户响应
		if(result) {
			response.sendRedirect("Hello.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
	}

}
