class conover
{   
    int id;
    String name;
    int age;
    public conover(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
     public conover(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public void printdata()
    {
        System.out.println("StudentID: "+id);
        System.out.println("Student name: "+name);
        if(age!=0)
        {
            System.out.println("Professor age: "+age);
        }
    }
    public static void main(String[] args)
    {
        conover chirag = new conover(101,"Chirag Rai");
        conover anvith = new conover(102,"Anvith Chakote");
        conover abhishek = new conover(202,"Abhishek",35);
        chirag.printdata();
        System.out.println("--------------------");
        anvith.printdata();
        System.out.println("--------------------");
        abhishek.printdata();
    }

}