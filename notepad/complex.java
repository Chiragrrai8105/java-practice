class complex
{
    public static void chirag(int start,int end)
    {
        int sum=0;
        int mul=1;
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
            else
            {
                mul=mul*i;
            }
        }
        System.out.println("sum="+sum);
        System.out.println("Mul="+mul);
        int total=sum+mul;
        System.out.println("total="+total);
    }
    public static void main(String[] args)
    {
        chirag(1,6);
    }
}