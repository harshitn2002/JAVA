class stringBuff
{
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("HELLO");
		s.append("Java");
		System.out.println("String after appending Java: "+s+"\n");

		s.insert(1,"Java");
		System.out.println("String after inserting Java at index 1: "+s+"\n");

		s.replace(1,2,"Java");
		System.out.println("String after replacing charcters at 1 and 2 with Java: "+s+"\n");

		s.delete(1,2);
		System.out.println("String after deleting charcter at index 1 and 2: "+s+"\n"); 

		s=new StringBuffer("HELLO"); 
		s.reverse();
		System.out.println("String HELLO after reversing: "+s+"\n");

	}
}
