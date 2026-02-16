class stringrevcheck {
    public static boolean areAnagrams(String s1, String s2) {
        int a=0,b=s1.length()-1;
        if(s1.length()!=s2.length())
        {
            return false;
        }
        else
        {
      for(int i=0;i<s1.length()-1;i++)
      {
          if(s1.charAt(a)!=s2.charAt(b))
          {
              return false;
          }
      }
        }
      return true;
    }
    
}