class duplicate
{
    public void demo(int arr[])
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[j]==arr[i])
            {
                System.out.println(arr[j]);
                j++;
            }
        }
    }
    public static duplicate obj()
    {
        return new duplicate();
    }
}