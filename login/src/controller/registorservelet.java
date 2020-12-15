package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Model;

/**
 * Servlet implementation class mv
 */
@WebServlet("/registor")
public class registorservelet extends HttpServlet {
	private static final long serialVersionUID =102831973239L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname=request.getParameter("first_name");
		String lastname=request.getParameter("last_name");
		String dob=request.getParameter("birthday");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String phonenumber=request.getParameter("phone");
		String password=request.getParameter("password");
		
		System.out.println(dob);
		
		DateFormat df=new SimpleDateFormat("dd-MMM-yy");
        String dob1=dob;
        try {
			Date d=(Date) df.parse(dob1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Model model=new Model();
		model.setFirstname(firstname);
		model.setLastname(lastname);
		model.setGender(dob1);
		model.setGender(gender);
		model.setEmail(email);
		model.setPhonenumber(phonenumber);
		model.setPassword(password);
		
		Dao dao=new Dao();
		Boolean result=dao.save(model);
		PrintWriter out=response.getWriter(); 
		if(result==true) {		 
			 out.print("Your details saved successfully... ");
			
		} else
			out.print("TRy again.. ");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
