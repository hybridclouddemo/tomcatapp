package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.net.InetAddress;
import java.net.UnknownHostException;

import java.util.Enumeration;

public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException
    {
    	
    	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.print("Tomcat app v1 - ");
	
	try {
		InetAddress myHost = InetAddress.getLocalHost();
		out.println("Host: " + myHost.getHostName());
	} catch (UnknownHostException ex) {
		out.println("Cannot detect host");
	}
    }
}
