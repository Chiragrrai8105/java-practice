class peakelement {
    public int demo(int[] arr) {
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
}