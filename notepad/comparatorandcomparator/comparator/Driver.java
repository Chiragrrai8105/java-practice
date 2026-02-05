import java.util.Arrays;
import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
      Compn ar[] = {
        new Compn("Ashith","A",100,12,2,12123,"Tata"),
        new Compn("mahesh","b",101,10,4,123123,"maruti"),
        new Compn("chirag","A",100,0,2,12123,"mahindra"),
      };

      Scanner sc = new Scanner(System.in);
      System.out.println("1: higher price  2: lower price  3: color ascending  4: color descending");
      int ch = sc.nextInt();
      switch(ch) {
        case 1:
          Arrays.sort(ar, (a,b) -> Integer.compare(b.price, a.price));
          break;
        case 2:
          Arrays.sort(ar, (a,b) -> Integer.compare(a.price, b.price));
          break;
        case 3:
          Arrays.sort(ar, (a,b) -> a.color.compareTo(b.color));
          break;
        case 4:
          Arrays.sort(ar, (a,b) -> b.color.compareTo(a.color));
          break;
        default:
          System.out.println("invalid choice");
          sc.close();
          return;
      }

      sc.close();

      // print sorted results
      for (Compn c : ar) {
        System.out.println(c);
      }
    }
}