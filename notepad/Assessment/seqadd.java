import java.util.Scanner;
class seqadd
{
    Scanner sc = new Scanner(System.in);
    public void demo(int ar[],int n)
    {
        int br[]=new int[n];
        for(int i=0;i<n;i++)
        {   
            int d=0;
            while(ar[i]<=9)
            {
                while(ar[i]>0)
                {
                    int c=ar[i]%10;
                    d=d+c;
                    ar[i]/=10;
                }
                ar[i]=d; 
            }
            br[i]=sc.nextInt();
            System.out.println(br[i]);
        }  
    }
    public static seqadd obj()
    {
        return new seqadd();
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
        obj().demo(ar,n);
    }
}