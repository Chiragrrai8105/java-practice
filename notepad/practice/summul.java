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
        int ar[] = new int[count+1];
        while(n1>0)
        {
            int r=n1%10;
            ar[i]=r;
            System.out.println(ar[i]);
            i++;
            n1/=10;
        }
        for (int j =0; j <ar.length-1; j++)
        {
            System.out.println(ar[j]);
            if(j!=0 && j!=ar.length-1)
            {
                sum=ar[i]+sum;
            }
            else
            {
                mul=mul*ar[i];
            }
        } 
        System.out.println("SUM: "+sum);
        System.out.println("MUL: "+mul); 
    }
    public static void main(String[] args)
    {
        demo(1224);
    }
}