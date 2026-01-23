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
											break;
										}
									case 2:
										{
											System.out.println("You have choosen kadai chicken and the order will be ready in 5 minutes");
											break;
										}
									case 3:
										{
											System.out.println("You have choosen Hariyali chicken and the order will be ready in 5 minutes");
											break;
										}		
								}
							}
						case 2:
							{
								System.out.println("In South we have Andra Pepper Chicken -> 1");
								System.out.println("In South we have Chicken Sukka -> 2");
								System.out.println("In South we have Chicken Chettinad  -> 3");
								int c=sc.nextInt();
								switch(c)
								{
									case 1:
										{
											System.out.println("You have choosen Andra Pepper Chicken and the order will be ready in 5 minutes");
											break;
										}
									case 2:
										{
											System.out.println("You have choosen Chicken Sukka and the order will be ready in 5 minutes");
											break;
										}
									case 3:
										{
											System.out.println("You have choosen Chicken Chettinad and the order will be ready in 5 minutes");
											break;
										}		
								}
							}	
					}
				}	

			case 2:
				{
					System.out.println("Select north as 1");
					System.out.println("Select south as 2");
					int b=sc.nextInt();
					switch(b)
					{
						case 1:
							{
								System.out.println("In North we have paneer butter Masala -> 1");
								System.out.println("In North we have  Dal Makhani -> 2");
								System.out.println("In North we have Baingan Bharta  -> 3");
								int c=sc.nextInt();
								switch(c)
								{
									case 1:
										{
											System.out.println("You have choosen Paneer butter Masala and the order will be ready in 5 minutes");
											break;
										}
									case 2:
										{
											System.out.println("You have choosen Dal Makhani and the order will be ready in 5 minutes");
											break;
										}
									case 3:
										{
											System.out.println("You have choosen Baingan Barta and the order will be ready in 5 minutes");
											break;
										}		
								}
							}
						case 2:
							{
								System.out.println("In South we have Rice Sambar -> 1");
								System.out.println("In South we have Sweet Pongal -> 2");
								System.out.println("In South we have Masala Dosa -> 3");
								int c=sc.nextInt();
								switch(c)
								{
									case 1:
										{
											System.out.println("You have choosen Rice Sambar and the order will be ready in 5 minutes");
											break;
										}
									case 2:
										{
											System.out.println("You have choosen Sweet Pongal and the order will be ready in 5 minutes");
											break;
										}
									case 3:
										{
											System.out.println("You have choosen  Masala Dosa and the order will be ready in 5 minutes");
											break;
										}		
								}
							}	
					}

				}	
		}
		
		
}
}




		

		
		




