class nonstatic1
{
    int a;
    int b;
    public void chirag()
    {
        System.out.println("hi chirag");
        System.out.println(a);
        System.out.println(b);
    }
    public nonstatic1(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) {
        {
            nonstatic1 d = new nonstatic1(10,20);
            nonstatic1 d1 = new nonstatic1(100,200);
            d.chirag();
        }
    }
}