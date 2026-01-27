class arraydemo
{
    public void demo(int ar [])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args)
    {
        int ar[]={1,2,3};
        arraydemo obj = new arraydemo();
        obj.demo(ar);

    }
}