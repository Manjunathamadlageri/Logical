package Module3;

import Module1.Account;
import Module2.Debitcard;

public class Shoping  extends Debitcard 
   {
	String productname;
	double productprice;
	String shippingadress;
	public Shoping(int pinnumber, int cvv, String expdate, Account a1)
	{
		super(pinnumber, cvv, expdate, a1);
	}


	public void selectproduct(String productname,double productprice,String shippingadress) 
	{
		if(this.productname==productname && this.productprice==productprice && this.shippingadress==shippingadress) 
		{
			System.out.println("product selected buynow");
		}
	}
}