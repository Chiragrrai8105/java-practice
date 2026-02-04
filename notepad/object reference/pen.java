public class pen
{
    priavte int id;
    private void setvalues(int id)
    {
        this.id=id;
    }
    private pen(int id)
    {
        super();
        setvalues(id);
    }
    public static pen penhelper(int id)
    {
        return new pen(id);
    }
}