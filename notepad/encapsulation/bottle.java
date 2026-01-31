public class bottle
{
    private String shape;
    private int bid;
    public void setshape(String name)
    {
        this.name=name;
    }
    public double getname()
    {
        return this.name;
    }
    public static void main(String[] args)
    {
        ATM sc = new ATM();
        sc.setbalance(234.44);
        System.out.println(sc.getbalance(789));
    }
}