import java.util.Scanner;
class factor
{
    public factor(int num)
    { 
        int num1=num;
        int ar[] = new int[10];
        int i=2;
        int j=0;
        int sum=0;
        int sum1=0;
        while(num>1)
        {
            if(num%i==0)
            {   
                ar[j]=i;
                num=num/i;
                j++;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<j;k++)
        {
        System.out.print(" "+ar[k]);
        int c=0;
        if(ar[k]>9)
        {
        while(ar[k]>0)
        {
            int d=ar[k]%10;
            c=d+c;
            ar[k]/=10;
        }
        ar[k]=c;
        }
        }
        System.err.println("");
        for(int k=0;k<j;k++)
        {
        System.out.print(" "+ar[k]);
        sum=ar[k]+sum;
    }
    System.out.println("");
     System.out.println("sum of prime factor: "+sum);
     while(num1>0)
     {
        int e=num1%10;
        sum1=sum1+e;
        num1/=10;
     }
     System.out.println("Sum of number: "+sum1);
     if(sum==sum1)
     {
        System.out.println("Bhooyah");
     }
     else
     {
        System.out.println("Not Bhooyah");
     }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        factor rc = new factor(num);
    }
}