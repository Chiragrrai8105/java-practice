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
        System.out.println("------------------------------");
        ArrayList<String> wishlist = new ArrayList<String>();
        wishlist.add("Bunglow");
        wishlist.add("G-wagon G63");
        wishlist.add("Defender octa");
        wishlist.add("Rangrover AutoBiography");
        wishlist.add("Lamborgini Urus");
        wishlist.add("Landcruiser 500");
        wishlist.add("rolls royce phantom");
        wishlist.add("rolls royce cullinon");
        wishlist.add("rolls royce spectre");
        wishlist.add("rolls royce ghost");
        wishlist.add("rolls royce phantom");
        wishlist.add(1,"Kawasaki H2r");
        wishlist.addFirst("Dugati");
        wishlist.addLast("BMW s1000 rr");
        System.out.println(wishlist);
    }
}