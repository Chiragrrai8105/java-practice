import java.time.LocalDateTime;
class initializer
{
    int id;
    String name;
    public static void date()
    {
        System.out.println(LocalDateTime.now());
    }
    {
        date();
        System.out.println("Employees are ready");
    }
    public static void main(String[] args) {
        {
            initializer ec = new initializer();
        }
    }
}