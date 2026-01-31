public class variable
{
    public static void sum(int... amount)
    {
        for(int i:amount)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        sum(1,2,3,4);
    }
}