import java.util.Scanner;
class armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num2=0,count=0,num3=0;
        System.out.println("Enter the number");
        int num=sc.nextInt();
        while(num>0)
        {
            int num1=num%10;
            count++;
            num/=10;
        }
        while(num>0)
        {
            num2=num%10;
            num2=num2^count;
            num3=num3+num2;
        }
        System.out.println(num3);
        if(num3==num)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}