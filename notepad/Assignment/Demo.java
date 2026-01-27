class Demo
{
    public static Demo objref(Demo ref)
    {
        return ref;
    }
    public static void main(String[] args)
    {
        Demo d = new Demo();
        System.out.println(d);
        Demo d1 = objref(d);
        System.err.println(d1);
    }
}