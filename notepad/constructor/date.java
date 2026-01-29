import java.util.Scanner;
class date
{
    public date(int n)
    {
        int b=0,e=0,g=0;
        int c=n;
        while(n>0)
        {
            int a=n%10;
            b+=a;
            n/=10;
        }
        if(b>=9)
        {
        while(b>=9)
            {
                int f=b%10;
                g+=f;
                b%=10; 
            }      
            if(b!=g)
            {
                b=g;
            }
        }  
        c/=1000000;
        while(c>0)
            {
                int d=c%10;
                e+=d;
                c/=10;
            }
        if((b+1)==e)
            {
                System.out.println("lucky person");
            }    
        else
            {
                System.out.println("Not happy person");
            } 
             System.out.println(e);
             System.out.println((b+1));  
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date");
        int n=sc.nextInt();
        date rc = new date(n);
    }
}