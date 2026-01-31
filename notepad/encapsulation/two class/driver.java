public class driver
{
    public static void main(String[] args)
    {
        ATM sc = new ATM();
        sc.setbalance(122.22);
        System.out.println(sc.getbalance(789));
    }
}