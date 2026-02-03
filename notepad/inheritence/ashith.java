class chirag
{
    String name;
    int age;
}
class chintu extends chirag
{
    String cook;
    String dancer;
}
class ashith extends chintu
{
    String bodybuilder;
    public ashith(String name,String cook,String bodybuilder)
    {
        super();
        this.name=name;
        this.cook=cook;
        this.bodybuilder=bodybuilder;  
    }
    public static void main(String[] args)
    {
        ashith c = new ashith("chintu","chirag","ashith");
        /*c.cook="chintu";
        c.name="chirag";
        c.bodybuilder="ashith";*/
        System.out.println(c.cook);
        System.out.println(c.name);
        System.out.println(c.bodybuilder);
    }
}