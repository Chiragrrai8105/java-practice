import java.util.Scanner;
class hw{
	public static void prime(int n)
	{
		boolean bool=false;
		for(int i = 2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				bool=true;
				break;
			}
			else
			{
				bool=false;
			}
		}	
			if(bool==true)
			{
				System.out.println("Not Prime number");
			}
			else
			{
				System.out.println("prime number");
			}
	}
	public static void notes(int m)
	{
		int twothousand=0,fivehundred=0,hundred=0,fifty=0,twenty=0,ten=0,five=0,two=0,one=0;
		while(m>0)
		{
			while(m>=2000)
			{
				twothousand++;
				m-=2000;
			}
			while(m>=500)
			{
				fivehundred++;
				m-=500;
			}
			while(m>=100)
			{
				hundred++;
				m-=100;
			}
			while(m>=50)
			{
				fifty++;
				m-=50;
			}
			while(m>=20)
			{
				twenty++;
				m-=20;
			}
			while(m>=10)
			{
				ten++;
				m-=10;
			}
			while(m>=5)
			{
				five++;
				m-=5;
			}
			while(m>=2)
			{
				two++;
				m=-2;
			}
			while(m>=1)
			{
				one++;
				m=-1;
			}
			if(twothousand>0)
			{
				System.out.println("Two thousand Rupee note :-"+twothousand);
			}
			 if(fivehundred>0)
			{
				System.out.println("Five hundred Rupee note :-"+fivehundred);
			}
			if(hundred>0)
			{
				System.out.println("Hundred Rupee note :-"+hundred);
			}
			if(fifty>0)
			{
				System.out.println("Fifty Rupee note :-"+fifty);
			}
			if(twenty>0)
			{
				System.out.println("Twenty Rupee note :-"+twenty);
			}
			if(ten>0)
			{
				System.out.println("Ten Rupee note :-"+ten);
			}
			if(five>0)
			{
				System.out.println("Five Rupee note :-"+five);
			}
			if(two>0)
			{
				System.out.println("Two Rupee note :-"+two);
			}
			if(one>0)
			{
				System.out.println("One Rupee note :-"+one);
			}
		}
	}
	public static void seqprime(int p)
	{
		for(int i=p;i>0;i--)
		{	boolean bool = false;
			for(int h=2;h<=p-1;h++)
			{
				if(i%h==0)
				{
					bool=true;
					break;
				}
			}
			p--;
		}		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to use prime function");
		System.out.println("Press 2 to Note counting function");
		System.out.println("Press 3 to Prime number till N function");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				{
					System.out.println("Enter the number");
					int pr=sc.nextInt();
					prime(pr);
					break;
				}
				case 2:
				{
					System.out.println("Enter the number");
					int nt=sc.nextInt();
					notes(nt);
					break;
				}
				case 3:
				{
					System.out.println("Enter the number");
					int sp=sc.nextInt();
					seqprime(sp);
					break;
				}
			default :
			{
				System.out.println("Invalid choice");
				break;
			}
			
		}
	}
}							