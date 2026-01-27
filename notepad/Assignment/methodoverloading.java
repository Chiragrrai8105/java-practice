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
      public static void sum(int m,int n,int p)
    {
        System.out.println("chirag with 3 parameter");
    }
    public static void sum(String m)
    {
        System.out.println("chirag with string parameter");
    }
     public static void sum(char m)
    {
        System.out.println("chirag with character parameter");
    }
    public static void main(String[] args)
    {
        sum(1);
        sum(1,2);
        sum(1,2,3);
        sum("hi");
        sum('c');
    }
}