class stringtoint{
    public void ascii(char ch)
    {
        int rc=ch;
        System.out.println(ch+"="+rc);
    }
    public static void main(String[] args)
    {   

        stringtoint vc = new stringtoint();
        vc.ascii('a');
    }
}