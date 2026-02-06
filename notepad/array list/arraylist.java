import java.util.ArrayList;
class arraylist
{
    public static void main(String[] args)
    {
       ArrayList<Integer> amount = new ArrayList<Integer>();
        amount.add(100);
        amount.add(200);
        amount.add(200);
        amount.add(1,999);
        System.out.println(amount);
        System.out.println("------------------------------");
        ArrayList<String> list = new ArrayList<String>();
        list.add("chethana");
        list.add("Dhanusha");
        list.add("Ashitha");
        list.add(1,"bhuvana");
        list.addFirst("Druvi");
        list.addLast("Bhuvana");
        System.out.println(list);
    }
}