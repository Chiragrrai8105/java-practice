import java util.Scanner;
class prime {
	public static void main(String[] args){
	Scanner sc = new Scanner();
	int n= sc.nextInt();
	Boolean num=false;
	for(int i=2;i<n-1;i++)
	{
		if(n%i==0)
		{
			num=true;
			break;
		}
		if(num==true)
		{
			System.out.println("prime Number");
		}
		else
		{
			System.out.println("Not prime Number");
		}
	}
}
}

		
	
