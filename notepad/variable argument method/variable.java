public class variable
{
    public static void sum(int... amount)
    {
        for(int i:amount)
        {
            System.out.println(i);
        }
    }
     public static void sum(String name,int... amount)
    {
        for(int i:amount)
        {
            System.out.println(i);
        }
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        sum("chirag",1,2,3,4);
    }
}