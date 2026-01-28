class printalpha
{
    public void demo()
    {   int a=1;
        for(char i='A';i<='Z';i++)
        {
            System.out.print(a +":");
            System.out.println(i);
            a++;

        }
    }   
    public static printalpha obj()
    {
        return new printalpha();
    }
    public static void main(String[] args)
    {
        obj().demo();
    }
}