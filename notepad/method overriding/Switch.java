import java.util.Scanner;
class cab
{
    public void ride()
    {
        int charge=0;
        System.out.println("charge: "+charge);
    }    
}
class ola extends cab
{
    public void ride()
    {
        System.out.println("welcome to ola");
        int charge=200;
        System.out.println("charge: "+charge);
    }
    
}
class uber extends cab
{
    public void ride()
    {
        System.out.println("welcome to uber");
        int charge=400;
        System.out.println("charge: "+charge);
    }
    
}
class zomato extends cab
{
    public void ride()
    {
        System.out.println("welcome to zomato");
        int charge=600;
        System.out.println("charge: "+charge);
    }
    
}
public class Switch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose 1 for ola");
        System.out.println("Choose 2 for uber");
        System.out.println("Choose 3 for zomato");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                {
                    cab c = new ola();
                    c.ride();
                    break;
                }
            case 2:
                {
                    cab c = new uber();
                    c.ride();
                    break;
                }
            case 3:
                {
                    cab c = new zomato();
                    c.ride();
                    break;
                }        
        }

    }
    
}