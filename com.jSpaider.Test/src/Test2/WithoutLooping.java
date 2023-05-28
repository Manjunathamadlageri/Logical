package Test2;

//    public class WithoutLooping 
//  {
//     public static void printnum(int n)
//	    {
//		   if(n>0)
//		    {
//		      printnum(n-1);
//	        System.out.println(n+ " ");
//          }
//		     return;
//	       }
//	   public static void main(String[] args) 
//	    {
//		  printnum(10);
//	    }
//   }
public class WithoutLooping 
{
	public static void main(String [] agrs)
	{
		printnum(1,10);
    }
	public static void printnum(int initial,int last)
	{
		if(initial<=last)
		{
		System.out.println(initial+" ");
		printnum(initial+1,last);
		}
	}
}
class Printnumber
{
	static int count=1;
	public static void printnumber(int n)
	{
		if(count<=n)
			count++;
		printnumber(n);
	}

public static void main(String [] args)
{
	printnumber(10);
}
}