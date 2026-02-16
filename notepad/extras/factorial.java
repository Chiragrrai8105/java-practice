class factorial
{
    public static void fact(int n)
    {
        int a=n*n-1;
        fact(n-1);
    }
    public static void main(String[] args)
    {
        int n=3;
        fact(n);
    }
}