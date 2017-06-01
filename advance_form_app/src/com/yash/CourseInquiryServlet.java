package com.yash;

import java.io.IOException;
import java.util.Enumeration;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/courseInquiryServlet")
public class CourseInquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  Enumeration parameters=request.getParameterNames();
	   StringBuilder SB=new StringBuilder();
	       while(parameters.hasMoreElements()){
	    	 Object obj=parameters.nextElement();
	    	    String parameter=(String)obj;
	    	    String parm= request.getParameter(parameter);
	    	    if (parameter.equals("course")){
	    	      String [] courses= request.getParameterValues(parameter);
	    	        for (String string : courses) {
						 SB.append(string+" ");
					}
	    	     }
	    	    System.out.println("parameter "+ parameter+" "+"Value"+" "+parm);
	          }
	       
	     System.out.println("Selected course "+SB);  
	}

}
