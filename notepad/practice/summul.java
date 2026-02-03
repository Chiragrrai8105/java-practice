import java.util.Scanner;
public class summul
{
    public static void demo(int n)
    {
        int sum=0,mul=1,count=0,n1=n,i=0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        int ar[] = new int[count];
        while(n1>0)
        {
            int r=n1%10;
            ar[i]=r;
            i++;
            n1/=10;
        }
       for(int j=1;j<count-1;j++)
        {
            sum=ar[j]+sum;
        } 
        mul=ar[0]*ar[count-1];
        System.out.println("SUM: "+sum);
        System.out.println("MUL: "+mul); 
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        demo(n);
    }
}