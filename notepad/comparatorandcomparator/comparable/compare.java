import java.util.Arrays;
public class compare
{
    public static void main(String[] args) {
      comparator ar[]={
        new comparator("chethana",21,"B+"),
        new comparator("ashitha",19,"A+"),
        new comparator("megha",18,"AB+")
    };
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
}