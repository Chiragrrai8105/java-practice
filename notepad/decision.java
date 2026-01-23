class decision {

	public static void main(String[] args) {
	int x=3,y=5,z=7;
    int budget = 1000;
	int a=10;
    /*if (x%2==0)
    {
        System.out.println("x is even");
    }
    else
    {
        System.out.println("x is odd");
    }*/
    if (budget<500)
    {
        System.out.println("can buy items");
    }
    else if ( budget>=1000)
    {
        System.out.println("cannot buy itmes");
    }
    else
    {
        System.out.println("Dont go to restaurant");
    }
    }
}
