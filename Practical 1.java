class Student
{
	long id;
	String Name,Branch,university;
  
	void setDetails(String a,String b,String c,long x)
	{
		Name=a;
		Branch=b;
		university=c;
		id=x;
	} 
	void showDetails()
	{
		System.out.println("Student Name: "+Name);
		System.out.println("Student ID: "+id);
		System.out.println("Branch: "+Branch);
		System.out.println("University: "+university);
	} 
	public static void main(String args[])
	{
		String a="Harshit Narang";
		String b="Computer Science"; 
		String c="GEHU";
		long x=20011150;

		Student s= new Student();
		s.setDetails(a, b, c, x);
		s.showDetails();
	}
	
}
