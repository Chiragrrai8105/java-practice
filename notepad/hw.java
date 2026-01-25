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
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not prime number");
			}
		}
	}
}							