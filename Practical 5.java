class Student
{
	long id;
	String Name,Branch;
	static String university="GEHU"; 
	void setDetails(String a,String b,long x)
	{
		Name=a;
		Branch=b;
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
		String a="Ambuj Bhandari";
		String b="Computer Science";
		long x=20011932;

		Student s= new Student();
		s.setDetails(a, b, x);
		s.showDetails();
	}
	
}
