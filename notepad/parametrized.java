class parametrized
{
    int id;
    String name;
    int age;
    String gender;
         parametrized(int id1,String name1,int age1,String gender1){
            id=id1;
            name=name1; // if name=name then use keyword "this".
            age=age1;
            gender=gender1;
         }
    public static void main(String[] args)
    {
        parametrized chirag = new parametrized(101,"chirag",21,"Male");
        parametrized akshar = new parametrized(102,"akshar",24,"Male");
        System.out.println("Name "+chirag.id);
        System.out.println("Age: "+chirag.age);
        System.out.println("Gender: "+chirag.gender);
        System.out.println("-------------------------");
        System.out.println("Name "+akshar.id);
        System.out.println("Age: "+akshar.age);
        System.out.println("Gender: "+akshar.gender);
    }

    
}