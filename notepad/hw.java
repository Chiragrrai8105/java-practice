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
			if(bool==true)
			{
				System.out.println("Not Prime number");
			}
			else
			{
				System.out.println("prime number");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to use prime function");
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
			default :
			{
				System.out.println("Invalid choice");
				break;
			}
			
		}
	}
}							