import java.util.Scanner;
public class divide
{
    public static void demo(int num)
    {
        int count=0,mul=1;
        int sq=num*num;
        int sq1=sq;
        System.out.println(sq);
        while(sq>0)
        {
            int rem=sq%10;
            count++;
            sq/=10;
        }
        System.out.println(count);
        if(count%2==0)
        {
            count/=2;
            System.out.println(count);
        }
        else
        {
            count/=2;
            count++;
            System.out.println(count);
        }
        for(int i=0;i<count;i++)
        {
            mul*=10;
        }
        System.out.println(mul);
        int sum1=sq1%mul;
        int sum2=sq1/mul;
        int sum=sum1+sum2;
        System.out.println(sq1);
        System.out.println(sum1);
        System.out.println(sum2);
        if(sum==num)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
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