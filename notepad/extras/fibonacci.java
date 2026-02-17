class fibonacci
{
    public static void main(String[] args)
    {
        int n=5;
        int arr[]=new int[n+2];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n+2;i++)
        {
            arr[i]=arr[i-2]+arr[i-1];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }    
    }
}