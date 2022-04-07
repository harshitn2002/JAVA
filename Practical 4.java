import java.util.*;
class Employee
{
    long id;
	String Name,department;
	double salary;
	Employee()
	{
		id=0;
		Name="";
		department="";
		salary=0.0d;
	} 
	void setDetails(String a,String b,long c,double d)
	{
		id=c;
		Name=a;
		department=b;
		salary=d;
	} 
	void showDetails()
	{
		System.out.println("Name of Employee: "+Name);
		System.out.println("ID of Employee: "+id);
		System.out.println("Department of Employee: "+department);
		System.out.println("Salary of Employee: "+salary);
	} 
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		Employee e=new Employee();

		System.out.println("Enter the Name of Employee");
		String a= in.nextLine();
		System.out.println("Enter the Employee ID");
		long c=in.nextLong();

		System.out.println("Enter the Department of Employee");
		String b=in.nextLine();
		in.nextLine();
		System.out.println("Enter the salary of Employee");
		double d=in.nextDouble();

		e.setDetails(a,b,c,d);
		e.showDetails();
	}
}
