class parent
{
    void dance()
    {
        System.out.println("Western dancer");
    }
}
class child extends parent
{
    void dance()
    {
        System.out.println("Classical dancer");
    }
}
public class demo()
{
    parent p = new child();
    p.dance();
}