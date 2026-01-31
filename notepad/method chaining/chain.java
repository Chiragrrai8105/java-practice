public class chain
{
    public chain demo1()
    {
        System.out.println("method 1");
        return this;
    }
    public chain demo2()
    {
        System.out.println("method 2");
        return this;
    }
    public chain demo3()
    {
        System.out.println("method 3");
        return this;
    }
    public chain demo4()
    {
        System.out.println("method 4");
        return this;
    }
    public static void main(String[] args)
    {
        chain d = new chain();
        d.demo1().demo2().demo3().demo4();
    }
    
}