interface dance
{
    public void demo();
}
public class check implements dance
{
    public void demo()
    {
        System.out.println("Demo");
    }
    public static void main(String[] args)
    {
        check c = new check();
        c.demo();
    }

}