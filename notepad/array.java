import java.util.Scanner;
class array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[6];
        //int arr[] = new int[10];
        /*for (int i=0;i<10;i++)
        {
            arr[i]=i;
            System.out.println(arr[i]);
        }*/
        /*for (int i=0;i<5;i++)
        {
            name[i]="chirag";
            System.out.println(name[i]);
        }*/
       for (int i=1;i<=name.length-1;i++)
        {
            System.out.println("Enter the name of" +i+ "person");
            name[i]=sc.nextLine();
        }
        for(int i=0;i<name.length-1;i++)
        {
            System.out.println(name[i]);
        }
        System.out.println("Length of array is "+(name.length-1));
        for(String i : name)System.out.println(i);
    }
}