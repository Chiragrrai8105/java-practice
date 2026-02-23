class peakelement {
    public static int demo(int[] arr) {
        int a=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    a=1;
                    return a;
                }
            }
        }    
       return a;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,3};
        System.out.println(demo(arr));
    }
}