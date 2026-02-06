import java.util.Scanner;
public class calculate_string
{
    public static  void demo(String name)
    {
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==" ")
            {
                count++
            }
            else
                count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name=sc.nextLine();
        demo(name);
    }

}