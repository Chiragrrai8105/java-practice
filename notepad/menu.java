import java.util.Scanner;
class menu {

	public static void main(String[] args)
	{
		System.out.println("1 Redrose 30");
		System.out.println("2 Barbie doll 200");
		System.out.println("3 silk chocolate 250");
		System.out.println("4 Yellow Rose 50");
		System.out.println("5 Ring  100");
		Scanner sc = new Scanner();

		int choice = sc.nextInt();
		switch(choice){
		case 1: 
		{
			System.out.println("You have choosen Redrose of worth 30");
			System.out.println("Are you my friend");
			System.out.println("1 Yes");
			System.out.println("2 No");
			int ch=sc.nextInt();
			switch(ch){
			case 1:
			{
				System.out.println("Red rose");
			}
			case 2:
			{
				System.out.println("pay the amount of 30");
				int amount=sc.nextInt();
				if(amount==30)
				{
					System.out.println("Amount paid");
					System.out.println("Red rose");
			

				else{
				System.out.println("Incorrect amount and pay the correct amount");
				}
			}
			case 2: 
		{
			System.out.println("You have choosen Barbie doll of worth 200");
			System.out.println("Are you my friend");
			System.out.println("1 Yes");
			System.out.println("2 No");
			int ch=sc.nextInt();
			switch(ch){
			case 1:
			{
				System.out.println("barbie doll");
			}
			case 2:
			{
				System.out.println("pay the amount of 200");
				int amount=sc.nextInt();
				if(amount==200)
				{
					System.out.println("Amount paid");
					System.out.println("Barbie doll");
			

				else{
				System.out.println("Incorrect amount and pay the correct amount");
				}
			}	
		
}
}




		

		
		




