class Parent extends Object
{
    int id;
    int age;
    public Parent()
    {
        super();
    }
}
class Child extends Parent
{
    String name;
    String gender;
    public Child()
    {
        super();
    }
}
public class Driver
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.id=101;
        System.out.println(c);
        System.out.println(c.id);
        c.age=20;
        System.out.println(c.age);
        c.name="chirag";
        System.out.println(c.name);
    }
}