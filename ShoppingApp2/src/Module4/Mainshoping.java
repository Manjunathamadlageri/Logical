package Module4;

import Module1.Account;
import Module3.Shoping;

public class Mainshoping 
{
	public static void main(String[] args) {
		Account a1=new Account("Dhanus",12345l,0.0,"basavangudi","BOB1230","BOB0411");
		Shoping s=new Shoping(7411,967,"11-23",a1);
		s.deposit(100000.0);
		s.setpinnumber(1234);
		s.getgenratepin();
		s.selectproduct("oneplus ", 50000.0, "basavangudi");
		s.onlinepayment(5000.0,1234);
	}

}
