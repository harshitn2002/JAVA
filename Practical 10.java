import java.util.*;
class Jagg
{ 
        
	public static void main(String args[])
	{
		int a[][]=new int[3][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[2]; 
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Elements of Jagged Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		
		
		System.out.println("The elements of jagged Array are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			} 
			System.out.println();
		} 
	}
}
