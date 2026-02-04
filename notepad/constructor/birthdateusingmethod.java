import java.util.Scanner;
class birthdateusingmethod
{
    public birthdateusingmethod(int n)
    {
        int rem=0;
        while(n>0)
        {
            int a=n%10;
            rem+=a;
            n/=10;
        }
    }    
        public static void demo(int date)
        {
        int e=0,g=0;
        if(rem>=9)
        {
        while(rem>=9)
            {
                int f=rem%10;
                g=g+=f;
                rem%=10; 
            }      
            if(rem!=g)
            {
                rem=g;
            }
        }  
        date/=1000000;
        while(date>0)
            {
                int d=date%10;
                e+=d;
                date/=10;
            }
        if((rem+1)==e)
            {
                System.out.println("lucky person");
            }    
        else
            {
                System.out.println("Not happy person");
            } 
             System.out.println(e);
             System.out.println((rem+1));  
        }    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date");
        int n=sc.nextInt();
        birthdateusingmethod rc = new birthdateusingmethod(n);
        rc.demo(n);
    }
}