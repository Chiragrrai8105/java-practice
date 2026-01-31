class mobile
{
    public mobile oppo()
    {
        System.out.println("front camera");
    }
    public mobile vivo()
    {
        System.out.println("front back camera");
    }
    public mobile iphone()
    {
        System.out.println("LED Display");
    }
    public mobile nothing()
    {
        System.out.println("16 gb RAM");
    }
    public static mobile obj()
    {
       return new mobile();
    }
    public static void main(String[] args)
    {
        obj().oppo().vivo().iphone().nothing();
    }
}

