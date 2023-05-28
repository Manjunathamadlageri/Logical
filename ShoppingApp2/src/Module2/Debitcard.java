package Module2;

import Module1.Account ;

public class Debitcard 
{
	private int pinnumber;
	private int cvv;
	private String expdate;
	Account a1;
	public Debitcard() 
	{
		super();
	}
	public Debitcard(int pinnumber, int cvv, String expdate, Account a1) 
	{
		this.pinnumber = pinnumber;
		this.cvv = cvv;
		this.expdate = expdate;
		this.a1 = a1;
	}
	public int getgenratepin() 
	{
		return pinnumber;

	}
	public void setpinnumber(int pinnumber) 
	{
		this.pinnumber=pinnumber;
	}
	public int getCvv() 
	{
		return cvv;
	}
	public void setCvv(int cvv) 
	{
		this.cvv = cvv;
	}
	public String getExpdate() 
	{
		return expdate;
	}
	public void setExpdate(String expdate)  
	{
		this.expdate = expdate;
	}
	public void updatedetail() 
	{
		System.out.println(cvv);
		System.out.println(expdate);
	}
	public void onlinepayment(double productamt,int pinnumber) 
	{
		if (this.pinnumber==pinnumber) 
		{
			//			if(shopingamt == productamt) {
			if (productamt<a1.bankbal) 
			{
				a1. bankbal=a1.bankbal-productamt;
				System.out.println("payment succesful and orderplaced");
			}
			else 
			{
				System.out.println("insufficent balance");
			}

		}

		else 
		{
			System.out.println("invalid pinnumber");
		}
	}
	public void deposit(double amt) 
	{
		a1.deposit( amt);		
	}
	public void withdraw(double amt) 
	{
		a1.withdraw(amt);
	}

}
