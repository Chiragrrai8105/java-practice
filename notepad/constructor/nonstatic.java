class nonstatic
{
    int a;
    public void demo()
    {
        System.out.println("hi chirag");
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        nonstatic p = new nonstatic();
        p.demo();
        p.a=10;
        p.demo();
    }
}