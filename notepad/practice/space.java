public class space
{
    public static  void demo(String name)
    {
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        demo("chirag Rai");
    }

}