package Arrays;

public class SecondLargest
{
    public static void main(String[] args) {
//        int[] arr={11,34,66,21,13,90,35};
//        int[] arr={12 ,35, 1 ,10 ,34 ,1};
        int[] arr={10,10,10};
        int n= arr.length;
        int ans=SecondLargestElement(n,arr);
        System.out.println("The second largest element present in the array is: "+ans);
    }
    public static int SecondLargestElement(int n,int[]arr)
    {
        int largest=arr[0];
        int second=-1;

        //first find the largest element
        for (int i = 0; i < n; i++)
        {
            if(arr[i]>largest)
            {
                second=largest;
                largest=arr[i];
            }

            else if (arr[i]!=largest && arr[i]>second)
            {
                second=arr[i];
            }
        }
        return second;
    }
}
