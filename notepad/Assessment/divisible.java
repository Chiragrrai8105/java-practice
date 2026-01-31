import java.util.Scanner;
class divisible
{
    public static void demo(int num)
    {
        int sum=0;
        while(num>0)
        {
        int rem=num%10;
        sum=sum+rem;
        num/=10;
        }
        if(num%sum==0)
        {
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num=sc.nextInt();
            demo(num);
        }
}