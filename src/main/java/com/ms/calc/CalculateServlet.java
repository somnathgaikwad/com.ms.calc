package com.ms.calc;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculateServlet")
public class CalculateServlet extends HttpServlet
{
	/**
	 * Comment updated
	 */
	private static final long serialVersionUID = 1L;
	double res;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		PrintWriter out=response.getWriter();
		String n1 = request.getParameter("no1");
		String n2 = request.getParameter("no2");
		String opt = request.getParameter("opt");
		
		if(opt.equals("addition")){
			res=new Calculater().doAdd(Integer.parseInt(n1), Integer.parseInt(n2));
		out.println("Addition of "+n1+" and "+ n2 + " is " + res);}
		else if(opt.equals("subtraction")){
			res=new Calculater().doSub(Integer.parseInt(n1), Integer.parseInt(n2));
			out.println("Subtraction of "+n1+" and "+ n2 + " is " + res);}
		else if(opt.equals("multiply")){
			res=new Calculater().doMul(Integer.parseInt(n1), Integer.parseInt(n2));
			out.println("Multiplication of "+n1+" and "+ n2 + " is " + res);}
		else if(opt.equals("division")){
			res=new Calculater().doDiv(Integer.parseInt(n1), Integer.parseInt(n2));
			out.println("Division of "+n1+" and "+ n2 + " is " + res);}
	}	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
			doPost(request, response);
	}
}	