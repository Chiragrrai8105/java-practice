class seqadd
{
    public void demo(int ar[])
    {   int br[]=new int[n];
        for(int i=0;i<=n;i++)
        {   
            int d=0;
            while(ar[i]<=9)
            {
                while(ar[i]>0)
                {
                    int c=ar[i]%10;
                    d=d+c;
                }
                ar[i]=d;
                
            }
        }
    }
}