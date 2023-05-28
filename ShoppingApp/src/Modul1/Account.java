package Modul1;

public class Account 
{
      String accuntHolderName;
      long accountNumber;
      public double bankBal;
      String branch;
      String IFSC;
      String bankName;
      public Account()
      {
    	  
      }
      public Account(String accuntHolderName,long accountNumber,String branch,String IFSC)
      {
    	  this.accuntHolderName=accuntHolderName;
    	  this. accountNumber= accountNumber;
    	  this.branch=branch;
    	  this.IFSC=IFSC;
      }
      public void Deposite(double amt)
  	{
    	  bankBal=bankBal+amt;
  		System.out.println("current bal="+bankBal+",Deposite Amount="+amt);
  	}
  	public void Withdraw(double amt)
  	{
  		if(bankBal>amt)
  		{
  			bankBal=bankBal-amt;
  			System.out.println("current bal="+bankBal+",Withdraw Amount="+amt);
  		}
  		else
  		{
  			System.out.println("Invalid Transaction");
  		}
  	}
  	public void CheckBal()
  	{
  		System.out.println( bankBal);
  	}
}
