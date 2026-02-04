class chirug
{
    public static void main(String[] args)
    {
       int n1=1224,i=0;
       int ar[] = new int[5];
        while(n1>0)        {
            int r=n1%10;
            ar[i]=r;
           System.out.println(ar[i]);
           i++;
             n1/=10;
        }
    }
}