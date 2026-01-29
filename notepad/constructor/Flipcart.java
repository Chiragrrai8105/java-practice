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
     public Flipcart(int id,String name,String address)
    {
         this.id=id;
        this.name=name;
        this.address=address;
    }    
    public void printdata()
    {
     if(age==0)
        {
        System.out.println("Seller ID: "+id);
        System.out.println("Seller name: "+name);
        System.out.println("Seller address: "+address);
        }
     else
        {   
        System.out.println("User ID: "+id);
        System.out.println("user name: "+name);
        System.out.println("user address: "+address);
        System.out.println("user Age: "+age);
        System.out.println("user Gender: "+gender);
        }
       
    }
    public static void main(String[] args)
    {
        Flipcart chirag = new Flipcart(101,"Chirag Rai","puttur",21,"Male");
        Flipcart anvith = new Flipcart(102,"Anvith Chakote","Sullya",21,"Male");
        Flipcart abhishek = new Flipcart(202,"Abhishek","Delhi");
        chirag.printdata();
        System.out.println("--------------------");
        anvith.printdata();
        System.out.println("--------------------");
        abhishek.printdata();
    }

}