class parent
{
    public void dance()
    {
        System.out.println("Western dancer");
    }
}
class child extends parent
{
    public void dance()
    {
        System.out.println("Classical dancer");
    }
}
public class demo
{
    public static void main(String[] args)
    {
    parent p = new child(); //here the object is given more importance.
    p.dance();
    }
}