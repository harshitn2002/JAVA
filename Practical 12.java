import java.util.*;
class Bank
{ 
        
	float getROI()
	{
	   return 0;
	}
} 
class HDFC extends Bank
{
	float getROI()
	{
		return(4.0f);
	}
} 
class PNB extends Bank
{
	float getROI()
	{
		return(4.5f);
	}
}
class SBI extends Bank
{
	float getROI()
	{
		return(5.0f);
	}
}
class XYZ 
{
	public static void main(String args[])
	{
  		Bank a=new Bank();
		System.out.println("Bank Intrest: "+a.getROI());
 
                a=new HDFC();
		System.out.println("HDFC Bank Intrest: "+a.getROI());

		a=new PNB();
		System.out.println("PNB Bank Intrest: "+a.getROI());

		a=new SBI();
		System.out.println("SBI Bank Intrest: "+a.getROI());
	}
}

