package Test3;
class Account
{
	String owner;
	long AccNo;
	double bal;
	public Account(String owner,long AccNo,double bal)
	{
		this.owner=owner;
		this.AccNo=AccNo;
		this.bal=bal;
	}
	public void Deposite(double amt)
	{
		bal=bal+amt;
		System.out.println("current bal="+bal+",Deposite Amount="+amt);
	}
	public void Withdraw(double amt)
	{
		if(bal>amt)
		{
			bal=bal-amt;
			System.out.println("current bal="+bal+",Withdraw Amount="+amt);
		}
		else
		{
			System.out.println("Invalid Transaction");
		}
	}
	public void showaccountdetails() 
	{
		System.out.println(owner);
		System.out.println(AccNo);
		System.out.println(bal);
	}
}
class Current extends Account
{
	double min_bal=10000.0;
	public Current(String owner,long AccNo,double bal)
	{
		super(owner,AccNo,bal);
	}
	public void Showmin_bal()
	{
		System.out.println("Min_bal= "+min_bal);
	}
}
class Saving extends Account
{
	double roi=0.05;
	public Saving(String owner,long AccNo,double bal)
	{
		super(owner,AccNo,bal);
	}
	public void Calculetroi() 
	{
		bal=bal+bal*roi;
		System.out.println("After roi bal=" +bal);
	}
}
public class CanstrecterChaining 
{

	public static void main(String[] args) 
	{
		Current c=new Current("Abc",12345678,50000.0);
		c.showaccountdetails();
		c.Deposite(5000.0);
		c.Withdraw(2000.0);
		Saving s=new Saving("Xyz",746456587,3000.0);
		s.showaccountdetails();
		s.Deposite(5000.0);
		s.Withdraw(2000.0);
		s.Calculetroi();
	}

}
