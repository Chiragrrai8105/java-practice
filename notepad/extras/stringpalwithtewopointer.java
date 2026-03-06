class stringpalwithtewopointer
{
    public static String demo()
    {
        String s="chiich";
        int j=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return "Not palindrome";
            }
            j--;
        }
        return "Palindrome";
    }
    public static void main(String[] args) {
        System.out.println(demo());
    }
}