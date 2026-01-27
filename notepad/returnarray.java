class returnarray
{
    public static int[] demo()
    {
        int ar[]={1,2,3};
        return ar;
    }
    public static void main(String[] args)
    {
        int ar[]=demo();
        for(int i=0;i<ar.length;i++)
        System.out.println(ar[i]);
    }
}