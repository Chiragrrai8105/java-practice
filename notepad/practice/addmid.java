class addmid
{
    public void demo(int ar[],int n)
    {
        for(int i=0;i<n;i++)
        {   
            int count=0;
            while(ar[i]>0)
            {
                int a=ar[i]%10;
                int count++;
                ar[i]/=10;
            }
            if(count%2!=0)
            {
                
            }
        }
    }
}