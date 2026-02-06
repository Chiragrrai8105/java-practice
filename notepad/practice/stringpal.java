class stringpal
{
    public static void main(String[] args)
    {
        String s="malayalam";
        boolean bool=true;
        char br[] = new char[s.length()];
        char ar[] = new char[s.length()];
        int j=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            br[j]=s.charAt(i);
            System.out.print(br[j]);
            j++;
        }
        System.out.println("");
         for(int k=0;k<s.length();k++)
        {
            System.out.print(s.charAt(k));
            ar[k]=s.charAt(k);
        }
        System.out.println("");
        for(int i=0;i<s.length();i++)
        {
            if(br[i]!=ar[i])
            {
                bool=false;
                break;
            }
        }
        if(bool==true)
            {
                System.out.println("palindrome");
            } 
       else
        {
            System.out.println("Not palindrome");
        }     
    }
}   