public class divide
{
    public static void demo(int n)
    {
        int count=0,m=1;
        while(n>0)
        {
            int a=n%10;
            count++;
            n/=10;
        }
        if(count%2==0)
        {
            count/=2;
        }
        else
        {
            count/=2;
            count++;
        }
        for(int i=0;i<count;i++)
        {
            m*=10;
        }
        int a1=n%m;
        int a2=n/m;
        int sum=a1+a2;
        if(sum==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}