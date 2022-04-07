import java.util.*;
class Account
{
    int account_number;
	String name;
	int amount;
	void insert(int acc,String n,int b)
	{ 
		account_number=acc;
		name=n;
		amount=b;
	}
 	void deposit(int d)
	{
		amount+=d;
	}
		
	void withdraw(int w)
	{
		if(w<amount)
      		{
	            amount-=w;
		}
		else
		{
	            System.out.println("Error Insufficient balance!!!");
		}
	}
	void checkbalance()
	{
		System.out.println("Balance:"+amount);
	}
	void display()
	{
		System.out.println("Name of Account Holder:"+name);
		System.out.println("Account Number:"+account_number);
		System.out.println("Amount left:"+amount);
        }		  
	public static void main(String args[])
	{ 
		Account st= new Account();
		Scanner in= new Scanner(System.in);
		System.out.println("Enter 1. To Enter details \n\t2.To deposit Amount\n\t3.To Withdraw amount\n\t4.To Check balance\n\t5.To display all details\n\t6.To Exit"); 
		System.out.println("Enter Your Choice:");
		int ch=in.nextInt();
		do
		{
			if(ch==1)
			{
				System.out.println("Enter the Account Number");
				int ac=in.nextInt();
 				in.nextLine();

				System.out.println("Enter the Name of Account Holder");
				String s=in.nextLine();

				System.out.println("Enter the Amount");
				int u=in.nextInt();
        		st.insert(ac,s,u); 
			}

			else if(ch==2)
			{
                System.out.println("Enter the Deposit Amount");
				int d=in.nextInt();
				st.deposit(d);
			} 

			else if(ch==3)
			{
				System.out.println("Name of Withdraw Amount");		
				int w=in.nextInt();

				st.withdraw(w); 
			}

			else if(ch==4)
			{	
				st.checkbalance();
			}
			
			else if(ch==5)
			{
				st.display(); 
			}
				
			else 
			{
				System.out.println("Enter a Valid Choice!!!!!!!");
			}   
			System.out.println("Enter Your Choice:");
			ch=in.nextInt();
		}while(ch!=6);
	}
}
