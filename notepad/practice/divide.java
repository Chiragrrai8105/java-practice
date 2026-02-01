import java.util.Scanner;
public class divide
{
    public static void demo(int n)
    {
        int count=0;
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
        
    }
}