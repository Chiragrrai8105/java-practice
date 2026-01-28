class employee
{
    String name;
    int id;
    long sal;
    public static void main(String[] args)
    {
        employee chirag = new employee();
        {
            chirag.name="Chirag Rai";
            chirag.id=100;
            chirag.sal=1000000;
            System.out.println("Name"+chirag.name);
            System.out.println("ID"+chirag.id);
            System.out.println("Salary"+chirag.sal);
        }
    }
}