class lowertoupper
{
    public static void main(String[] args)
    {
        String s = "chirag rai";
        /*for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<90)
            {
                if(s.charAt(i)==32)
                {
                    continue;
                }
                else
                {
                    s.charAt(i)=s.charAt(i)+32;
                }   
            }
        System.out.println(s.charAt(i));    
        }*/
       for(int i=0;i<s.length();i++)
       {
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                System.out.print((char)(ch-32));
            }
            else
            {
                System.out.print(ch);
            }
       }
    }
}