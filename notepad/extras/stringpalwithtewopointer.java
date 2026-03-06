class stringpalwithtewopointer
{
    public static String demo()
    {
        int j=0;
        String s="chiich";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return "Not palindrome";
            }
            j++;
        }
        return "Palindrome";
    }
    public static void main(String[] args) {
        System.out.println(demo());
    }
}