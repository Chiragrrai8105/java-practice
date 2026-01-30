import java.util.Scanner;
class factor
{
    public factor(int num)
    { 
        int ar[] = new int[10];
        int i=2;
        int j=0;
        while(num>1)
        {
            if(num%i==0)
            {   
                ar[j]=i;
                num=num/i;
                j++;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<j;k++)
        {
        System.out.print(" "+ar[k]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        factor rc = new factor(num);
    }
}