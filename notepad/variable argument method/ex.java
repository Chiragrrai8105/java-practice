class ex
{
    public static void demo(String name,int... n)// int... n is an array;
    {
        int sum=0;
        for(int i:n)
        {
            sum+=i;
        }
        int avg=sum/n.length;
        System.out.println("average: "+avg);
    }
    public static void demo(String name)
    {
        int a=0;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        demo("chirag",1,2,3);
        demo("ashith");

    }
}