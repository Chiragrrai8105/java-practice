class increment {

	public static void main(String[] args) {
	int x=3,y=5,z=7;
	int a=10;
	//System.out.println(a++);
	//System.out.println(++a);
	//System.out.println(a++ + ++a);
	//System.out.println(a++ * ++a + 17 + ++a + a++ - 14 * 3);
	//System.out.println(a++ * a++ + 17 + ++a + ++a - 14 * 3);
	//System.out.println(a-- * --a + 17 + --a + a-- - 14 * 3);
	int r=x++ + y-- + ++z + (x>y ? ++x : y--) + (z-- - x++); 
	//System.out.println(x+""+y+""+z+""+r);
	System.out.println(r);


}
}
	
