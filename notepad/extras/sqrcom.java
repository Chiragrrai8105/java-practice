import java.util.Scanner;
class sqrcom
{
    public static void demo(int n)
    {
        int n1=n,n2=n,n3=n,count=0,mul=0;
        n*=n;
        while(n2>0)
        {
            n2/=10;
            count++;
        }
        for(int i=0;i<count;i++)
        {
            mul*=10;
        }
        int rem=n%mul;
        System.out.println(rem);
        if(n3==rem)
        {
            System.out.println("Equal");
        }
        else
            System.out.println("Not Equal");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        demo(n);
    }
}