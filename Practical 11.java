import java.util.*;
class Shape
{ 
	void area(double r)
	{
		System.out.println("Area of circle: "+(3.14*r*r));
	}
	void area(int s)
	{
		System.out.println("Area of Square: "+(s*s));
	}
	void area(int l,int b)
	{
		System.out.println("Area of Rectangle: "+(l*b));
	}
	void area(float b,float h)
	{
		System.out.println("Area of Triangle: "+(0.2*b*h));
	}
	public static void main(String args[])
	{
		Shape s=new Shape();
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double r=in.nextInt();
		s.area(r);
		
		System.out.println("Enter the Side of Square");
		int a=in.nextInt();
		s.area(a);
		
		System.out.println("Enter the length and breadth of rectangle");
		int l=in.nextInt();
		int b=in.nextInt();
		s.area(l,b);
		
		System.out.println("Enter the base and height of Triangle");
		float x=in.nextFloat();
		float y=in.nextFloat();
		s.area(x,y);
	}  
}
