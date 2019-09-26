package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAOModel;

public class Balance extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	{
		try
		{
			HttpSession hs=request.getSession();
			int accno=(int) hs.getAttribute("accno");
			
			DAOModel dao=new DAOModel();
			dao.setAccno(accno);
			
			boolean temp=dao.checkBalance();
			
			if(temp==true)
			{
				hs.setAttribute("balance", dao.getBalance());
				response.sendRedirect("/bankapplication/balancesuccess.jsp");
		
			}
			else
			{
			//	HttpSession hs=request.getSession(true);
				
				response.sendRedirect("/bankapplication/balancefailure.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
}
}