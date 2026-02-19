public class diamond
{
    public static void main(String[] args)
    {
        int num=1,n=6;
        for(int i=1;i<=n;i++)
        {
            for(s=1;s<n;s++)
            {
                System.out.println(" ");
            }
            System.out.println(num++);
            if(i>1)
            {
                for(int s=1;i<=(2*i-3);s++)
                {
                    System.out.println(" ");
                }
            }
            System.out.println(num++);
            for(int i=0;i<=n;i++)
            {
                System.out.println(" ");
            }
            System.out.println(num);
        }
    }
}