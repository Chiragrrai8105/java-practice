class Static
{
    static int a = 10;
    int b=20;
    public static void main(String[] args)
    {
        System.out.println(a);
        Static rc = new Static();
        System.out.println(rc.b);
    }
}