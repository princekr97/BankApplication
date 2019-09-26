package model;

import java.sql.*;

public class DAOModel
{
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet res=null;
	private int accno;
	private int custid;
	private String cname;
	private int  balance;
	private String password;
	private String email;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) 
	{
		this.accno = accno;
	}
	public int getCustid() 
	{
		return custid;
	}
	public void setCustid(int custid) 
	{
		this.custid = custid;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname) 
	{
		this.cname = cname;
	}
	public int getBalance() 
	{
		return balance;
	}
	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public DAOModel()
	{
		DBConnector dbc=new DBConnector();
		con=dbc.giveConnection();
	}
	
	public boolean login() 
	{
		try {
			pstmt=con.prepareStatement("SELECT * FROM BANKAPPLICATION WHERE CUSTOMER_ID=? AND PASSWORD=?");
			
			pstmt.setInt(1, custid);
			pstmt.setString(2, password);
			res=pstmt.executeQuery();
			if(res==null)
			{
				return false;
			
		}
			else {
						while(res.next()==true)
						{
							accno=res.getInt("ACCOUNT_NUMBER");
							cname=res.getString("CUSTOMER_NAME");
						}
			}
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return true;
	}

	public boolean checkBalance()
	{
		try {
			pstmt=con.prepareStatement("SELECT BALANCE FROM BANKAPPLICATION WHERE ACCOUNT_NUMBER=?");
			pstmt.setInt(1, accno);
			res=pstmt.executeQuery();
			if(res==null)
			{
				return false;
			
		}
			else {
						while(res.next()==true)
						{
							balance=res.getInt("BALANCE");
							return true;
						}
			}
			
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;

}

public boolean fundTransfer(int amount)
{
	try {
		pstmt=con.prepareStatement("UPDATE BANKAPPLICATION SET BALANCE=BALANCE-? WHERE ACCOUNT_NUMBER=?");
		pstmt.setInt(1, amount);
		pstmt.setInt(2, accno);
	   int num=pstmt.executeUpdate();
		if(num==0)
		{
			return false;
		
	}
		else
		{
        	return true;
					}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return true;
}

}
