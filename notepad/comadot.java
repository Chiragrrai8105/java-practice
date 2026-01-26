class comadot
{
    public static void main()
    {
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.print(i);
            }
            if(i%2==0&&i!=10)
            {
                System.out.print(",");
            }
             if(i==10)
            {
                System.out.print(".");
            }
        }
    }
}