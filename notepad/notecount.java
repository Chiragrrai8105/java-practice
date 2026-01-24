import java.util.Scanner;
class notecount {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the cash");
	int value = sc.nextInt();
	int twothousand=0;
	int onethousand=0;
	int fifty=0;
	int ten=0;
	int five=0;
	int two=0;
	while(value<1)
	{
		while(value>=2000)
		{
			twothousand
