public class diamond
{
    public static void main(String[] args)
    {
        int num=1,n=6;
        for(int i=1;i<=n;i++)
        {
            for(int s=i;s<n;s++)
            {
                System.out.print(" ");
            }
            System.out.print(num++);
            if(i>1)
            {
                for(int s=1;s<=(2*i-3);s++)
                {
                    System.out.print(" ");
                }
            
                System.out.print(num++);
            }
            System.out.println();
        }    
            for(int k=1;k<n;k++)
            {
                System.out.print(" ");
            }
            System.out.println(num);
    }
}