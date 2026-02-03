class Parent extends Object
{
    String shape;
    String type;
    public Parent()
    {
        super();
    }
}
class Child extends Parent
{
    String color;
    int modelnumber;
    public Child()
    {
        super();
    }
}
public class telephone
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.shape="Round";
        System.out.println(c);
        System.out.println(c.shape);
        c.type="Analog";
        System.out.println(c.type);
        c.color="Blue";
        System.out.println(c.color);
        c.modelnumber="Blue";
        System.out.println(c.modelnumber);
    }
}