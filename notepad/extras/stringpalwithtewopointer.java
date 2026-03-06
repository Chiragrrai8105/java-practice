class stringpalwithtewopointer
{
    public static int demo()
    {
        String s="chiich";
        for(int i=0;i<s.length();i++)
        {
            for(int j=s.length()-1;j>0;j--)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    return "Not palindrome";
                }
            }
        }
        return "Palindrome";
    }
    public static void main(String[] args) {
        System.out.println(demo());
    }
}