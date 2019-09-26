package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAOModel;

public class Transfer extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) 
	{
		try
		{
			int acn=Integer.parseInt(request.getParameter("ACNO"));
			int amount=Integer.parseInt(request.getParameter("AMOUNT"));
			HttpSession hs=request.getSession();
			int accno=(int) hs.getAttribute("accno");
			
			DAOModel dao=new DAOModel();
			dao.setAccno(accno);
			boolean temp=dao.fundTransfer(amount);
			
			if(temp==true)
			{
				response.sendRedirect("/bankapplication/successTransfer.jsp");
			}
			else
			{
				response.sendRedirect("/bankapplication/failureTransfer.jsp");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	}
		