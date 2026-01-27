class methodbinding
{
    public static void demo(byte a)
    {
        System.out.println("Method accept byte data");
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        demo((byte)10);
        
    }
}