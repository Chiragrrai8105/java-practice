public class summul
{
    public static void demo(int n)
    {
        int sum=0,mul=1,count=0,n1=n,i=0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        int ar[] = new int[count];
        while(n>0)
        {
            int r=n%10;
            ar[i]=r;
            i++;
            n/=10;
        }
        for (int j = 0; j < ar.length; j++)
        {
            if(j!=0 && j!=ar.length)
            {
                sum=ar[i]+sum;
            }
            else
            {
                mul=mul*ar[i];
            }
        } 
        System.err.println("SUM: "+sum);
        System.out.println("MUL: "+mul);   
    }
    public static void main(String[] args)
    {
        demo(1224);
    }
}