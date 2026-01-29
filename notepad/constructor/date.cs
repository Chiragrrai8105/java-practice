class date
{
    public date(int n)
    {
        int b=0;
        while(n>0)
        {
            int a=n%10;
            int b=b+a;
            n/=10;
        }
    }
}