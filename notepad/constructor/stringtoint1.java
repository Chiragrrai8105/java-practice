import java.util.Scanner;
class stringtoint1
{
    public stringtoint1(char ar[])
    {
        int d=0;
        for(int i=0;i<ar.length;i++)
        {
            int a =ar[i];
            int b=a-64;
            System.out.print(" "+b);
            d=d+b;
        }
        System.out.println("");
        System.out.println(" Sum: "+d);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        System.out.println("Enter the Sequence of character");
        for(int i=0;i<n;i++)
        {
           char ar[i]=sc.next().charAt(0);
        }
        stringtoint1 e = new stringtoint1(ar);
    }
}
