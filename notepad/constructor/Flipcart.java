class Flipcart
{   
    int id;
    String name;
    int age;
    String address;
    String gender;
    public Flipcart(int id,String name,String address,int age,String gender)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.age=age;
        this.gender=gender;

    }
     public Flipcart(int id,String name,String address,int age)
    {
         this.id=id;
        this.name=name;
        this.address=address;
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