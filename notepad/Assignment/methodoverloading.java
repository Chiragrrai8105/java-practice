class methodoverloading
{
    public static void sum(int m)
    {
        System.out.println("chirag with 1 parameter");
    }
     public static void sum(int m,int n)
    {
        System.out.println("chirag with 2 parameter");
    }
    public static void main(String[] args)
    {
        sum(1);
        sum(1,2);
    }
}