package IfElse;

public class Stetaments 
{
	public static void main(String []args)
	
	{
      int[]a= {1,2,3,4,6,8};
      for(int i=0;i<=a.length-1;i++)
      {
    	  if(a[i]%2==0)
    	  {
    		  System.out.println("the number is Even" + a[i]);
    	  }
    	  else
    	  {
    		  System.out.println("the number is not Even");
    	  }
      }

     }
}