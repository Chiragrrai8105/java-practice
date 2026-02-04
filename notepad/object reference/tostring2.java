class chirag1
{
    public String name;
    private int age;
    public void setdemo(int age)
    {
        this.age=age;
    }
    public int getdemo()
    {
        return this.age;
    }
    public chirag1(String name,int age)
    {
        super();
        this.name=name;

    }
    /*public String tostring1()
    {
        return "name="+"pooja"+"AGE="+22;
    }*/
}   
public class tostring2
{
    public static void main(String[] args)
    {
        chirag1 c = new chirag1("pooja",21);
        System.out.println("Name: "+c.name);
        c.setdemo(25);
        System.out.println(c.getdemo());
    }
}    
