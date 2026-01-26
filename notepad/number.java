import java.util.Scanner;
class number
{
    public static void range(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number");
        int start=sc.nextInt();
         System.out.println("Enter the end number");
        int end=sc.nextInt();
        range(start,end);
    }
}