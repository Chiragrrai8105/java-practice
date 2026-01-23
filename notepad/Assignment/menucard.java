import java.util.Scanner;
class menucard{

	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("1 Non veg");
		System.out.println("2 veg");
		System.out.println("Enter the choice");
		int a=sc.nextInt();
		switch(a)
		{
			case 1:
				{
					System.out.println("Select north as 1");
					System.out.println("Select south as 2");
					int b=sc.nextInt();
					switch(b)
					{
						case 1:
							{
								System.out.println("In North we have Tandoori kofta chicken -> 1");
								System.out.println("In North we have  kadai chicken -> 2");
								System.out.println("In North we have hariyali chicken  -> 3");
								int c=sc.nextInt();
								switch(c)
								{
									case 1:
										{
											System.out.println("You have choosen Tandoori kofta chicken and the order will be ready in 5 minutes");
										}
									case 2:
										{
											System.out.println("You have choosen kadai chicken and the order will be ready in 5 minutes");
										}
									case 3:
										{
											System.out.println("You have choosen Hariyali chicken and the order will be ready in 5 minutes");
										}		
								}
							}
						case 2:
							{
								System.out.println("In South we have Andra pepper chicken -> 1");
								System.out.println("In South we have chicken sukka -> 2");
								System.out.println("In South we have chicken chettinad  -> 3");
								int c=sc.nextInt();
								switch(c)
								{
									case 1:
										{
											System.out.println("You have choosen Tandoori kofta chicken and the order will be ready in 5 minutes");
										}
									case 2:
										{
											System.out.println("You have choosen kadai chicken and the order will be ready in 5 minutes");
										}
									case 3:
										{
											System.out.println("You have choosen Hariyali chicken and the order will be ready in 5 minutes");
										}		
								}
							}	
					}

				}
		}

		


		
		
			
		
}
}




		

		
		




