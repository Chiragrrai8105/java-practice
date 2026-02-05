import java.util.Scanner;
class addmid
{
    public static void demo(int ar[],int n)
    {
        int m=1,sum=0;
        for(int i=0;i<n;i++)
        {   
            //System.out.println(ar[i]);
            int temp=ar[i];
            int count=0;
            while(ar[i]>0)
            {
                int a=ar[i]%10;
                count++;
                ar[i]/=10;
            }
            //System.out.println(count);
            if(count%2!=0)
            {
                count/=2;
                //System.out.println(count);
                for(int j=0;j<count;j++)
                {
                    m=m*10;
                }
                //System.out.println(m);
                int n1=0;
                n1=temp/m;
                //System.out.println(ar[i]);
                //System.out.println(n1);
                temp%=10;
                System.out.println(temp);
                sum+=temp;
                m=1;
            }
        }
        System.out.println("Sum: "+sum);
    }       
           public static void main(String[] args)
           {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of elements");
            int n=sc.nextInt();
            int ar[] = new int[n];
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            demo(ar,n);
           }
}