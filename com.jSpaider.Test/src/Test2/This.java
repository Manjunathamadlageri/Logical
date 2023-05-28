package Test2;

public class This 
{
	public This()
	{
		System.out.println("Zero Args");
	}
	public This(int a)
	{
		this();
		System.out.println("This int");
	}
	public This(int a,double b)
	{
		this(12);
		System.out.println("This int,double");
	}
	public This(double a,int b)
	{
		this(12,23.09);
		System.out.println("This double,int");
	}
	public This(double a,double b)
	{
		this(1.0,12);
		System.out.println("This double,double");
	}

	public static void main(String[] args) 
	{
		new This(10.9,19.8);
	}
}