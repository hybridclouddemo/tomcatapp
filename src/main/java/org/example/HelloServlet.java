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
	out.println("Tomcat app v1\n\n");
	out.println("Headers:<hr/>");
	Enumeration<String> headerNames = req.getHeaderNames();
	while (headerNames.hasMoreElements()) {
		String headerName = headerNames.nextElement();
		out.print("Header Name: <em>" + headerName);
		String headerValue = req.getHeader(headerName);
		out.print("</em>, Header Value: <em>" + headerValue);
		out.println("</em><br/>");
	}
	try {
		InetAddress myHost = InetAddress.getLocalHost();
		out.println("<p>Host: <em>" + myHost.getHostName() + "</em></p>");
	} catch (UnknownHostException ex) {
		out.println("<p>Cannot detect host</p>");
	}
    }
}
