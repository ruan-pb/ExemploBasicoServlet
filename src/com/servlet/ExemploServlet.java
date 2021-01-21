package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExemploServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		Date hoje = new Date();
		
		PrintWriter out = response.getWriter(); // envia o testo do html ao cliente
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<h1 style = \"text-align: center: \">");
		out.println("HELLO WORD!! <BR/>");
		out.println("DATA: "+hoje);
		out.println("</h1>");
		out.println("</BODY");
		out.println("</HTML");
	}


}
