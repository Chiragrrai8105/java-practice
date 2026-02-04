public class Hash
{
    int id;
    public Hash()
    {
        super();
        this.id=id;
        this.name=name;
    }
    public int hashcode()
    {
        return demo.hash(id,name);
    }
    public static void main(String[] args)
    {
        Hash d = new Hash(101,"chirag");
        System.out.println(d.hashcode());
    }
}