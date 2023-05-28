package Access;
public class AccessSpecifier 
{
	public void sample1()
	{
		System.out.println("public");
	}
	protected void sample2()
	{
		System.out.println("protected");
	}
	void sample3()
	{
		System.out.println("pkg level defult");
	}
	private void sample4()
	{
		System.out.println("private");
	}

	  public static void main(String[] args) 
	     {
		  AccessSpecifier s1=new AccessSpecifier();
	       s1.sample1(); 
           s1.sample2(); 
           s1.sample3();
           s1.sample4();
      }
	
}
