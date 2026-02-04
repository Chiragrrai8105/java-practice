class ATM
{
    private int id;
    private double balance;
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    public double getbalance(int password)
    {
        if(password==789)
        return this.balance;
        else return 0;
    }
    public static void main(String[] args)
    {
        ATM sc = new ATM();
        sc.setbalance(234.44);
        System.out.println(sc.getbalance(789));

    }

}