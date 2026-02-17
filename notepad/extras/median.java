import java.util.Arrays;
class median {
    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        double n;
        int count=arr.length;
        //System.out.println(count);
        if(count%2==0)
        {
            count/=2;
            n=(arr[count]+arr[count-1])/2.0;
        }
        else
        {
            count/=2;
            count--;
            n=arr[count];
        }
        return n;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4};
        System.out.println(findMedian(arr));
    }
}
