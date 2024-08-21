package Arrays;

public class Largest {
    public static void main(String[] args) {
        int[] arr={11,34,66,21,13,90,35};
        int n= arr.length;
        int ans=LargestElement(n,arr);
        System.out.println("The largest element present in the array is: "+ans);
    }
    public static int LargestElement(int n,int[]arr)
    {
        int largest=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>=largest)
                largest=arr[i];
        }
        return largest;
    }
}
