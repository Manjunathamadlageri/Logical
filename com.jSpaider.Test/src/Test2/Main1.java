package Test2;
class Jspiders 
{
	String Jspider_branch="Basavanagudi";
	public void displayBranch()
	{
		System.out.println("Jspider_branch");
	}
}
	
	class Student extends Jspiders
	{
		String Name="abc";
		String Deegre="BE";
		String Stream="E&C";
		String YOP="MAY-2022";
		
		public void studentDetails()
		{
			System.out.println(Name);
			System.out.println(Deegre);
			System.out.println(Stream);
			System.out.println(YOP);
		}
	}

public class Main1 {

	public static void main(String[] args) 
	{
		Student s=new Student();
		s.studentDetails();
		s.displayBranch();
	}

}
