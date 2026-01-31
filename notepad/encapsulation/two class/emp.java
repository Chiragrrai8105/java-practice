class emp
{
    private int id;
    private String name;
    private double salary;
    private int age;
    public void setid(int id)
    {
        this.id=id;
    }
    public int getid()
    {
        return id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setsal(double salary)
    {
        this.salary=salary;
    }
    public double getsal()
    {
        return salary;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public int getage()
    {
        return age;
    }
    public static void main(String[] args) {
        emp sc = new emp();
        sc.setid(10);
        System.out.println(sc.getid());
        sc.setname("chirag");
        System.out.println(sc.getname());
        sc.setsal(1010000);
        System.out.println(sc.getsal());
        sc.setage(20);
        System.out.println(sc.getage());
    }

}