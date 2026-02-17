import java.util.Arrays;
class median {
    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int count=0;
        double n;
        for(int i=0;i<arr.length;i++)
        {
            count++;
        }
        //System.out.println(count);
        if(count%2==0)
        {
            count/=2;
            n=(arr[count]+arr[count+1])/2;
        }
        else
        {
            count/=2;
            count++;
            n=arr[count];
        }
        return n;
    }
    public static void main(String[] args)
    {
        int arr[]={1,11,3,4};
        System.out.println(findMedian(arr));
    }
}
