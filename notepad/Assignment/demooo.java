class demooo
{
    public static demooo objref()
    {
        demooo s = new demooo();
        return new demooo();
    }
    public static void main(String[] args)
    {
       System.out.println(objref());
    }
}
