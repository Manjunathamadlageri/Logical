package Module3;

import Modul1.Account;
import Module2.Debitcard;

public class Shopping extends Debitcard
{
	String productName;
	double productprice;
	String ShoppingAddress;
	Account a1;
	public Shopping(String productName,double productprice,String ShoppingAddress)
	{
		this.productName=productName;
		this.productprice=productprice;
		this.ShoppingAddress=ShoppingAddress;
	}

	public void SelectProduct()
	{
		if(this.productName== productName && this.productprice==productprice && this.ShoppingAddress== ShoppingAddress)
		{
			if(productprice<a1.bankBal)
			{
				a1.bankBal=a1.bankBal-productprice;
				System.out.println("Product is Selected");
			}
			else
			{
				System.out.println("Invalied");
			}
		}
	}

}