class chirag
{
    String name;
    int age;
    public chirag(String name,int age)
    {
        super();
        this.name=name;
        this.age=age;
    }
    /*public String tostring1()
    {
        return "name="+"pooja"+"AGE="+21;
    }*/
}   
public class tostring1
{
    public static void main(String[] args) {
        chirag c = new chirag("pooja",21);
        System.out.println("Name: "+c.name);

    }
}    
