class father
{
    static int a=10;
}
public class chirag extends father{
    public void demo()
    {
        System.out.println("hi chirag");
        System.out.println("age: "+a);
    }
    public static void main(String[] args)
    {
        System.out.println(a);
        chirag c = new chirag();
        c.demo();
    }
}