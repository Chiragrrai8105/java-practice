class Parents extends Object
{
    int id;
    int age;
    public Parents(int id,int age)
    {
        super();
        this.id=id;
        this.age=age;
    }
}
class Childs extends Parents
{
    String name;
    String gender;
    public Childs(int id,int age)
    {
        super(id,age);
    }
    void print()
    {
        System.out.println("id: "+id);
    }
}
class Drivers
{
    public static void main(String[] args)
    {
        Childs c = new Childs(101,20);
        c.id=101;
        System.out.println(c);
        System.out.println(c.id);
        c.age=20;
        System.out.println(c.age);
        c.name="chirag";
        System.out.println(c.name);
        c.print();
    }
}