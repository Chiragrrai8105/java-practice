class employee
{
    String name;
    int id;
    long sal;
    public static void main(String[] args)
    {
        employee chirag = new employee();
        employee ashith = new employee();
            chirag.name="Chirag Rai";
            chirag.id=100;
            chirag.sal=1000000;
            System.out.println("Name"+chirag.name);
            System.out.println("ID"+chirag.id);
            System.out.println("Salary"+chirag.sal);
            ashith.name="Ashith Rai";
            ashith.id=101;
            ashith.sal=1000001;
            System.out.println("--------------------");
            System.out.println("Name"+ashith.name);
            System.out.println("ID"+ashith.id);
            System.out.println("Salary"+ashith.sal);
    }
}
