import java.util.Scanner;
class mul23
{
    public mul23(int ar[],int n)
    {
        int a=0;
        while(n>0)
        {
            int br[]=new int[10];
            n=n%10;
            a=n+a;
            for(int i=0;i<10;i++)
                if(ar[i]!=a)
                {
                    br[a]=a;
                }
            n=n/10;
            }        
    }
     /*public mul23(int ar[],int b,int c)
    {
        int a=0;
        while(b>0)
        {
            int br[]=new int[10];
            b=b%10;
            a=b+a;
            for(int i=0;i<10;i++)
                if(ar[i]!=a)
                {
                    br[a]=a;
                }
            b=b/10;
        }
    }*/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ar[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int b=c;
        mul23 rc = new mul23(ar,n);
        b=b*2;

    }
}