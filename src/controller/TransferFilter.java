package controller;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class TransferFilter implements Filter {

    public TransferFilter() {
        // TODO Auto-generated constructor stub
    }
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		//int acn=Integer.parseInt(request.getParameter("ACNO"));
		int amount=Integer.parseInt(request.getParameter("AMOUNT"));
		if(amount<=0)
		{
			((HttpServletResponse) response).sendRedirect("/bankapplication/errorTransfer.jsp");
	}
		else
		{
			chain.doFilter(request, response);
		}

	}
}

