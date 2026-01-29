import java.util.Scanner;
class amazon
{   
    int id;
    String name;
    int age;
    String address;
    String gender;
    public amazon(int id,String name,String address)
    {
         this.id=id;
        this.name=name;
        this.address=address;
    }    
    public amazon(int id,String name,String address,int age,String gender)
    {
        this(id,name,address); // the upper constructor parameter and this parameter should be same.
        this.gender=gender;
        this.age=age;
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
     Scanner sc = new Scanner(System.in);   
     System.out.println("Enter the Username");
     String uname=sc.nextLine();
     System.out.println("Enter the password");
     String upassword=sc.nextLine();
     String UNAME="chirag";
     String UPASSWORD="1234";
     if((uname.equals(UNAME))&&(upassword.equals(UPASSWORD))) //cant use == operator because == compares the object id
    {
        amazon chirag = new amazon(101,"Chirag Rai","puttur",21,"Male");
        amazon anvith = new amazon(102,"Anvith Chakote","Sullia",21,"Male");
        amazon abhishek = new amazon(202,"Abhishek","Delhi");
        chirag.printdata();
        System.out.println("--------------------");
        anvith.printdata();
        System.out.println("--------------------");
        abhishek.printdata();
    }  
    else
        {
            System.out.println("Incorrect username and password");
        }  
    }

}