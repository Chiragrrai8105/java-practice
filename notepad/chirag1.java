class chirag1
{
    public static void main(String[] args)
    {
        int p = 7;

        for(int i = p; i > 1; i--)
        {
            boolean bool = false;

            for(int h = 2; h <= i - 1; h++)
            {
                if(i % h == 0)
                {
                    bool = true;
                    break;
                }
            }

            if(bool == false)
                System.out.println(i);
        }
    }
}
