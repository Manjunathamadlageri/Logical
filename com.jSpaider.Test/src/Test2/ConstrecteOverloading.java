package Test2;

public class ConstrecteOverloading 
{
	String name;
long phoneno;;
String Email;
public ConstrecteOverloading(String name,long phoneno)
{
	this.name=name;
	this.phoneno=phoneno;
}
public ConstrecteOverloading(String name,String Email)
{
	this.name=name;
	this.Email=Email;
}
public void checkdetails()
{
	System.out.println(name);
	System.out.println(phoneno);
}
public void checkdetails1()
{
	System.out.println(name);
	System.out.println(Email);
}
public static void main(String[] args) 
{
	 ConstrecteOverloading c=new ConstrecteOverloading("abc",91645820);
	c.checkdetails();
	ConstrecteOverloading c1=new ConstrecteOverloading("abc","abc@123");
	c.checkdetails1();
}

}
