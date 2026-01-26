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
					System.out.println("Select chinese as 3");
					int b=sc.nextInt();
					switch(b)
					{
						case 1:
							{
								System.out.println("In North we have Tandoori kofta chicken -> 1");
								System.out.println("In North we have  Kadai chicken -> 2");
								System.out.println("In North we have Hariyali chicken  -> 3");
								System.out.println("In North we have Butter chicken  -> 4");
								System.out.println("In North we have Mutton kabeb  -> 5");
								System.out.println("In North we have Mutton korma  -> 6");	
							    System.out.println("In North we have Amritsari Fish Fry  -> 7");	
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
									case 4:
										{
											System.out.println("You have choosen Butter chicken and the order will be ready in 5 minutes");
											break;
										}
									case 5:
										{
											System.out.println("You have choosen Mutton Kabeb and the order will be ready in 5 minutes");
											break;
										}
									case 6:
										{
											System.out.println("You have choosen Mutton Korma and the order will be ready in 5 minutes");
											break;
										}
									case 7:
										{
											System.out.println("You have choosen Amritsari Fish Fry and the order will be ready in 5 minutes");
											break;
										}
									default :
									{
										System.out.println("Invalid food");
											break;
									}							
								}
								break;
							}
						case 2:
							{
								System.out.println("In South we have Andra Pepper Chicken -> 1");
								System.out.println("In South we have Chicken Sukka -> 2");
								System.out.println("In South we have Chicken Chettinad  -> 3");
								System.out.println("In South we have Chettinad Prawn Curry  -> 4");
								System.out.println("In South we have Mutton Kola Urundai -> 5");
								System.out.println("In South we have Paya curry -> 6");
								System.out.println("In South we have Seer Fish Fry  -> 7");
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
									case 4:
										{
											System.out.println("You have choosen Chettinad Prawn Curry and the order will be ready in 5 minutes");
											break;
										}
									case 5:
										{
											System.out.println("You have choosen Mutton Kola Urundai and the order will be ready in 5 minutes");
											break;
										}
									case 6:
										{
											System.out.println("You have choosen  Paya curry and the order will be ready in 5 minutes");
											break;
										}	
									case 7:
										{
											System.out.println("You have choosen  Seer Fish Fry and the order will be ready in 5 minutes");
											break;
										}
										default : 
										{
											System.out.println("Invalid food");
											break;
										}					
													
								}
								break;
							}
						case 3:
							{
								System.out.println("In Chinese we have Chicken Fried Rice -> 1");
								System.out.println("In Chinese we have Chicken Noodles -> 2");
								System.out.println("In Chinese we have Mutton Fried Rice -> 3");
								System.out.println("In Chinese we have Egg Fried Rice -> 4");
								System.out.println("In Chinese we have Egg Noodles -> 5");
								System.out.println("In Chinese we have Egg Manchurian -> 6");
								System.out.println("In Chinese we have Chicken Manchurian  -> 7");
								int c=sc.nextInt();
								switch(c)
								{
									case 1:
										{
											System.out.println("You have choosen Chicken Fried Rice and the order will be ready in 5 minutes");
											break;
										}
									case 2:
										{
											System.out.println("You have choosen Chicken Noodles and the order will be ready in 5 minutes");
											break;
										}
									case 3:
										{
											System.out.println("You have choosen Mutton Fried Rice and the order will be ready in 5 minutes");
											break;
										}
									case 4:
										{
											System.out.println("You have choosen Egg Fried Rice and the order will be ready in 5 minutes");
											break;
										}
									case 5:
										{
											System.out.println("You have choosen Egg Noodles and the order will be ready in 5 minutes");
											break;
										}
									case 6:
										{
											System.out.println("You have choosen  Egg Manchurian and the order will be ready in 5 minutes");
											break;
										}	
									case 7:
										{
											System.out.println("You have choosen  Chicken Manchurian and the order will be ready in 5 minutes");
											break;
										}	
										default : 
										{
											System.out.println("Invalid food");
											break;
										}								
								}
								break;
							}			
					}
					break;
				}	

			case 2:
				{
					System.out.println("Select north as 1");
					System.out.println("Select south as 2");
					System.out.println("Select chinese as 3");
					int b=sc.nextInt();
					switch(b)
					{
						case 1:
							{
								System.out.println("In North we have paneer butter Masala -> 1");
								System.out.println("In North we have  Dal Makhani -> 2");
								System.out.println("In North we have Baingan Bharta  -> 3");
								System.out.println("In North we have Paneer Tikka  -> 4");
								System.out.println("In North we have Malai Kofta  -> 5");
								System.out.println("In North we have Aloo Gobi -> 6");
								System.out.println("In North we have Chole Masala  -> 7");
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
									case 4:
										{
											System.out.println("You have choosen Paneer Tikka and the order will be ready in 5 minutes");
											break;
										}
									case 5:
										{
											System.out.println("You have choosen Malai Kofta and the order will be ready in 5 minutes");
											break;
										}	
									case 6:
										{
											System.out.println("You have choosen Aloo Gobi and the order will be ready in 5 minutes");
											break;
										}	
									case 7:
										{
											System.out.println("You have choosen Chole Masala and the order will be ready in 5 minutes");
											break;
										}
										default : 
										{
											System.out.println("Invalid food");
											break;
										}
								}
								break;
							}
						case 2:
							{
								System.out.println("In South we have Rice Sambar -> 1");
								System.out.println("In South we have Sweet Pongal -> 2");
								System.out.println("In South we have Masala Dosa -> 3");
								System.out.println("In South we have Onion Dosa -> 4");
								System.out.println("In South we have Medu Vada -> 5");
								System.out.println("In South we have Appam -> 6");
								System.out.println("In South we have Bisi Bele Bath -> 7");
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
									case 4:
										{
											System.out.println("You have choosen Onion Dosa and the order will be ready in 5 minutes");
											break;
										}
									case 5:
										{
											System.out.println("You have choosen  Medu Vada and the order will be ready in 5 minutes");
											break;
										}
									case 6:
										{
											System.out.println("You have choosen  Appam and the order will be ready in 5 minutes");
											break;
										}
									case 7:
										{
											System.out.println("You have choosen  Bisi Bele Bath and the order will be ready in 5 minutes");
											break;
										}	
										default : 
										{
											System.out.println("Invalid food");
											break;
										}				
								}
								break;
							}
						case 3:
							{
								System.out.println("In North we have Veg Noodles -> 1");
								System.out.println("In North we have Veg Fried Rice -> 2");
								System.out.println("In North we have Gobi Manchurian -> 3");
								System.out.println("In North we have Paneer Fried Rice -> 4");
								System.out.println("In North we have Paneer Noodles -> 5");
								System.out.println("In North we have Mushroom Noodles -> 6");
								System.out.println("In North we have Mushroom Fried Rice -> 7");
								int c=sc.nextInt();
								switch(c)
								{
									case 1:
										{
											System.out.println("You have choosen Veg Noodles and the order will be ready in 5 minutes");
											break;
										}
									case 2:
										{
											System.out.println("You have choosen Veg Fried Rice and the order will be ready in 5 minutes");
											break;
										}
									case 3:
										{
											System.out.println("You have choosen Gobi Manchurian and the order will be ready in 5 minutes");
											break;
										}	
									case 4:
										{
											System.out.println("You have choosen Paneer Fried Rice and the order will be ready in 5 minutes");
											break;
										}
									case 5:
										{
											System.out.println("You have choosen Paneer Noodles and the order will be ready in 5 minutes");
											break;
										}	
									case 6:
										{
											System.out.println("You have choosen Mushroom Noodles and the order will be ready in 5 minutes");
											break;
										}	
									case 7:
										{
											System.out.println("You have choosen Mushroom Fried Rice and the order will be ready in 5 minutes");
											break;
										}	
										default : 
										{
											System.out.println("Invalid food");
											break;
										}						
								}
								break;
							}		
					}
					break;

				}
					
		}		
		
}
}




		

		
		




