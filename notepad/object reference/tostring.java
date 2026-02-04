class tostring
{
    public String tostring()
    {
        return "this ia a string";
    }
    public static void main(String[] args)
    {
        tostring c = new tostring();
        System.out.println(c);
        System.out.println(c.toString());
        System.out.println(c.tostring());
        
    }
}