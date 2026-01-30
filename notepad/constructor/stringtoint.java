class stringtoint
{
    public stringtoint(char ar[])
    {
        int d=0;
        for(int i=0;i<ar.length;i++)
        {
            int a =ar[i];
            int b=a-64;
            System.out.print(" "+b);
            d=d+b;
        }
        System.out.println("");
        System.out.println(" Sum: "+d);
    }

    public static void main(String[] args)
    {
        char ar[]={'D','I','S','C','I','P','L','I','N','E'};
        stringtoint e = new stringtoint(ar);
    }
}
