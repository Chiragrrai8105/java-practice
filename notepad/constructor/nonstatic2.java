class nonstatic2
{
    int a;
    int b;
    public void chirag()
    {
        System.out.println("hi chirag");
        System.out.println(a);
        System.out.println(b);
    }
    public static void check()
    {
        
        System.out.println("This is a static method");
    }
    public nonstatic2()
    {
        System.out.println("There is no arguement");
    }
    public nonstatic2(int a,int b)
    {
        this();
        System.out.println("There is a parametraized constructor");
        this.a=a;
        this.b=b;
        check();
    }
    public static void main(String[] args) {
        {
            nonstatic2 d = new nonstatic2(10,20);
            nonstatic2 d1 = new nonstatic2(100,200);
            d.chirag();
        }
    }
}