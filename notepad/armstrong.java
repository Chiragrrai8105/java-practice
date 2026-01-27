import java.util.Scanner;
class armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0,num3=0;
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int result=num;
        while(num>0)
        {
            int num1=num%10;
            count++;
            num/=10;
        }
        while(result>0)
        {
            int pow=1;
            int num2=result%10;
            for(int i=1;i<=count;i++)
            {
            pow*=num2;
            }
            num3=num3+pow;
            result/=10;
        }
        System.out.println(num3);
        System.out.println(count);
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