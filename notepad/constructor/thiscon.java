class thiscon
{
    public thiscon()
    {
        System.out.println("Hi");
    }
    public thiscon(int a)
    {
        this();
    }
    public static void main(String[] args)
    {
        thiscon sc = new thiscon(1);
    }
}