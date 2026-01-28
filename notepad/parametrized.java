import java.util.Scanner;
class parametrized
{
    int id;
    String name;
    int age;
    String gender;
    Scanner sc = new Scanner(System.in);
         parametrized(int id1,String name1,String gender1){
            System.out.println("Enter the Age");
            age = sc.nextInt();
            id=id1;
            name=name1; // if name=name then use keyword "this".
            gender=gender1;
         }
    public static void main(String[] args)
    {
        parametrized chirag = new parametrized(101,"chirag","Male");
        parametrized akshar = new parametrized(102,"akshar","Male");
        System.out.println("Name "+chirag.name);
        System.out.println("Age: "+chirag.age);
        System.out.println("Gender: "+chirag.gender);
        System.out.println("-------------------------");
        System.out.println("Name "+akshar.name);
        System.out.println("Age: "+akshar.age);
        System.out.println("Gender: "+akshar.gender);
    }
}