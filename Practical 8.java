import java.util.*;
class Student
{
	long id;
	String Name,Branch,city,university; 
	Student(String a)
	{
		Name=a; 
		System.out.println("Constructor With One Argument\n");
	} 
	Student(String a,String b)
	{
		this(a);
		Branch=b; 
		System.out.println("Constructor With Two Argument\n");
	} 
	Student(String a,String b,String c)
	{
		this(a,b);
		city=c;
		System.out.println("Constructor With Three Argument\n");
	} 
	Student(String a,String b,String c,String d)
	{
		this(a,b,c);
		university=d;
		System.out.println("Constructor With Four Argument\n");
	} 
	Student(String a,String b,String c,String d,long e)
	{
		this(a,b,c,d);
		id=e;
		System.out.println("Constructor With Five Argument\n");
	} 
	void display()
	{
		System.out.println("Name of Student: "+Name);
		System.out.println("ID of Student: "+id);
		System.out.println("Branch of Student: "+Branch);
		System.out.println("City: "+city);
		System.out.println("University: "+university);
	}
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in); 
		System.out.println("Enter the name of Student");
		String a=in.nextLine();

		System.out.println("Enter the Branch of Sudent");
		String b=in.nextLine();
		System.out.println("Enter the city");
		String c=in.nextLine(); 

		System.out.println("Enter the name of University");
		String d=in.nextLine();
		System.out.println("Enter the Student ID");
		long e=in.nextLong();

		Student s=new Student(a,b,c,d,e); 
		System.out.println();
		s.display();
	}
}
