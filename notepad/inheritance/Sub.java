class Super
{
    String name="chirag";
}
public class Sub extends Super
{
    String name="ashith";
   void print()
    {
        System.out.println(super.name);
        System.out.println(this.name);
    }
    public static void main(String[] args) 
        {
            Sub s = new Sub();
            System.out.println(s.name);
            s.print();
        }
}