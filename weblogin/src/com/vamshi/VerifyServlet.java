package com.vamshi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerifyServlet extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	String user =req.getParameter("u");
	String password=req.getParameter("p");
	
	if(user.equals("vamshikrishna")&&password.equals("vam143"))
		out.println("<h2> welcome vamshikrishna <h2>");
	else
		out.println("<h2> Error ! login::please check the password or username<h2>");
}
}
 