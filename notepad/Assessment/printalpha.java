class printalpha
{
    public void demo()
    {   int a=1;
        for(char i='A';i<='Z';i++)
        {
            System.out.println(i);
            a++;
            System.out.println(a);

        }
    }   
    public static printalpha obj()
    {
        return new printalpha();
    }
    }
}