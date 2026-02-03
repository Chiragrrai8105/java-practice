class chirag
{
    String name;
    int age;
}
class chintu extends chirag
{
    String cook;
    String dancer;
    public chintu(String cook)
    {
        System.out.println(cook);
    }
}
class pinki extends chirag
{
    String bodybuilder;
    public pinki(String name,String bodybuilder)
    {
        super();
        this.name=name;
        //this.cook=cook;
        this.bodybuilder=bodybuilder;  
    }
    public static void main(String[] args)
    {
        pinki c = new pinki("chirag","ashith");
        chintu a = new chintu("chintu");
        System.out.println(a.cook);
        System.out.println(c.name);
        System.out.println(c.bodybuilder);
    }
}