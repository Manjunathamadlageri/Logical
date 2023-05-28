package Module1;

public class Account 
{
	String accountHoldername;
	long acccountNumber;
	public double bankbal;
	String branch;
	String IFSC;
	String bankname;
	public Account(String accountHoldername, long acccountNumber, double bankbal, String branch, String iFSC,String bankname) 
	{
		super();
		this.accountHoldername = accountHoldername;
		this.acccountNumber = acccountNumber;
		this.bankbal = bankbal;
		this.branch = branch;
		this.IFSC = iFSC;
		this.bankname = bankname;
	}
	public void deposit(double amt) 
	{
		bankbal=bankbal+amt;
		System.out.println("current bal= "+  bankbal);
	}
	public void withdraw(double productamt) 
	{
		if (bankbal>productamt) 
		{
			bankbal=bankbal-productamt;
		}
		else 
		{
			System.out.println("insufficent balance");
		}
	}

	public void checkbal() 
	{
		System.out.println(bankbal);
	}
}

