class duplicate
{
    public void demo(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
    public static duplicate obj()
    {
        return new duplicate();
    }
    public static void main(String[] args)
    {
        int arr[]={1,4,3,5,3};
        obj().demo(arr);
    }
}