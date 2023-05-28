package Test3;

public class Calculetor 
{
public static void calculet(int a,int b,String oprater)
{
	switch(oprater)
	{
	case "+":System.out.println(a+b); break;
	case "-":System.out.println(a-b); break;
	case "*":System.out.println(a*b); break;
	case "/":System.out.println(a/b); break;
	}
}
	public static void main(String[] args) 
	{
		calculet(11,3,"-");
	}

}
