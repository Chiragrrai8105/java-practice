class Employee
{
    static int sal;
    int age;
    String name;
    public Employee(String name,int age,int sal)
    {
        this.name=name;
        this.age=age;
        this.sal=sal;
    }
    public void demo()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);
    }
    public static void Demo()
    {
        System.out.println(sal);
    }
    public static void main(String[] args) {
        Employee rc = new Employee("chirag",25,20000000);
        rc.demo();
        Demo();
    }
}