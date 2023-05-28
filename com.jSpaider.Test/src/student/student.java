package student;

public class student 
{
	String name;
	String branch;
	int sem;
	double marks;
	public student(String name, String branch,int sem,double marks)
	{
		this.name=name;
		this.branch=branch;
		this.sem=sem;
		this.marks=marks;
		
	}
	public void CheckDetails()
	{
		System.out.println(name);
		System.out.println(branch);
		System.out.println(sem);
		System.out.println(marks);
	}
	public void checkbranch( )
	{
	
	if( this.branch.equals("EC") || this.branch.equals("CS") )
			{
				System.out.println("yes");
			}
		
	}
	public static void main(String [] args)
	{
		student s=new student("manju","EC",8,6.2);
				s.CheckDetails();
				s.checkbranch();
	    student s1=new student("ananda","mech",8,6.4);
				s1.CheckDetails();
				s1.checkbranch();
	
	}

}
