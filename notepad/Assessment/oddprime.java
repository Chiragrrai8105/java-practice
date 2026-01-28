import java.util.Scanner;
class oddprime
{
    public void demo()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int start=sc.nextInt();
        System.out.println("enter the last number");
        int end =sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0&&i%2!=0)
                {
                    System.out.println(i);
                }
            }
        }
    }
    public static oddprime obj()
    {
        return new oddprime();
    }
    public static void main(String[] args)
    {
        obj().demo();
    }
}