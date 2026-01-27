class persqrref
{
    public static void  percube(int num)
    {
        for(int i=1;i<=num;i++)
        if(i*i*i*i==num)
        {
            System.out.println("perfect cube");
            return;
        }
       System.out.println("not a perfect cube");
    }
    public static persqrref objref()
    {
        return new persqrref();
    }
    public static void main()
    {
        objref.percube(27);
    }
}