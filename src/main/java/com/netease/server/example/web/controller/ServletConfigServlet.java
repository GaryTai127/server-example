package com.netease.server.example.web.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigServlet extends HttpServlet{

	
	@Override
	public void init() throws ServletException {
		System.out.println("init method");
		ServletConfig config = this.getServletConfig();
		String v1 = config.getInitParameter("data1");
		String v2 = config.getInitParameter("data2");
		System.out.println("v1:" + v1 + ", v2:" + v2 + ".");
		
		ServletContext ctx = this.getServletContext();
		String g1 = ctx.getInitParameter("globalData1");
		String g2 = ctx.getInitParameter("globalData2");
		System.out.println("g1:" + g1 + ", g2:" + g2);
		
		ctx.setAttribute("globalData1", 222);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service method");
		
		super.service(arg0, arg1);
	}
	
}
