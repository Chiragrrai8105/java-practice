class fastslow
{
    public static void main(String[] args)
    {
        int slow=0,fast=1;
        int arr[]={1,2,3,4,5,6,7};
        while(fast<arr.length-1)
        {
            slow++;
            fast+=2;
        }
        System.out.println(arr[slow]);
    }
}