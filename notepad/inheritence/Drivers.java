class Parents extends Object
{
    int id;
    int age;
    public Parents()
    {
        super();
    }
}
class Childs extends Parents
{
    String name;
    String gender;
    public Childs(int a)
    {
        super();
    }
}
public class Drivers
{
    public static void main(String[] args)
    {
        Childs c = new Childs(2);
        c.id=101;
        System.out.println(c);
        System.out.println(c.id);
        c.age=20;
        System.out.println(c.age);
        c.name="chirag";
        System.out.println(c.name);
    }
}