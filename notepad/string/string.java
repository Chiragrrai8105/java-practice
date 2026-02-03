public class string
{
    public static void main(String[] args)
    {
        String s="Hi";
        String s1="Hi";
        System.out.println(s=s1);
        String s2="chirag";
        System.out.println(s2.length());
        for(int i=0;i<s2.length();i++)
        {
            System.out.println(s2.charAt(i));
        }
        for(int i=s2.length()-1;i>=0;i--)
        {
            System.out.print(s2.charAt(i));
        }
    }    
}