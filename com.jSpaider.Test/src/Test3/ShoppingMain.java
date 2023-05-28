package Test3;
class Shopping
{
	String productname;
	String productid;
	double productprice;
	public Shopping(String productname,String productid,double productprice)
	{
		this.productname=productname;
		this.productid=productid;
		this.productprice=productprice;
	}
	public void OrderProduct(String productname,double productprice)
	{
	    this.productname=productname;
		this.productprice=productprice;	
	}
	public void Shodetails()
	{
		System.out.println(productname);
		System.out.println(productid);
		System.out.println(productprice);
	}
}
class Mobile extends Shopping
{
	public Mobile(String productname,String productid,double productprice)
	{
		super(productname,productid,productprice);
	}
	public void Ordermobile()
	{
		double discount=productprice*0.2;
		if(productprice>5000)
		{
			productprice=productprice-discount;
			System.out.println("Ofter the discount ofthe product "+productprice);
		}
		else 
		{
			System.out.println(productprice);
		}
	    }
}
public class ShoppingMain 
{
	public static void main(String[] args) 
	{
		Mobile m1=new Mobile("Realme","5Pro",25000.0);
		      m1.Ordermobile();
        Mobile m2=new Mobile("Samsung","M31",35000.0);
		      m2.Ordermobile();     
	}

}
