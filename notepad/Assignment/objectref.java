class objectref
{
    public static void demo(objectref ref)
    {
        System.out.println(ref);
    }
    public static void main(String[] args)
    {
        objectref d = new objectref();
        System.out.println(d);
        demo(d);
    }
}