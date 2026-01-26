import java.util.Scanner;
class string
{
    public static void range(String m)
    {
       System.out.println("I want to marry "+m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String m=sc.nextLine();
        range(m);
    }
}