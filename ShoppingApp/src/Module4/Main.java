package Module4;

import Modul1.Account;
import Module2.Debitcard;
import Module3.Shopping;

public class Main 
{
	public static void main(String[] args) 
	{
		 Account a1=new Account("manju",123444l,"Basavagudi","SBI009N");
		 Debitcard d1=new Debitcard();
		 d1.generatePin(123);
		 d1.updatedetails(777,"02-25");
		 Shopping s1=new Shopping("Realme5pro",150000.0,"Benglour");
		 a1.Deposite(500000.0);
		 s1.SelectProduct();
	}

}






























































