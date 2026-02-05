
import java.util.Comparator;

public class comparator implements Comparable<comparator>
{
    String name;
    int age;
    String bg;
    
    public comparator(String name,int age,String bg)
    {
        super();
        this.name=name;
        this.age=age;
        this.bg=bg;
    }
    public String toString()
    {
        return "comparator [name" + name + ", age" + age + ",BG" + bg + "]";
    } 
    public int compareTo(comparator gf)
    {
        return this.age-gf.age;
    }
    public int compareTo(comparator gf)
    {
        return this.name.compareTo(gf.name);
    }
}
}