package array;

public class Even 
{
	public static void main(String [] args)
	{
		int a[]= {1,10,8,23};
		int count;
		for(count=1;count<=a.length-1;count++)
		{
			if(count%2==0)
			{
				System.out.println(count);
			}	
		}
	}
}
