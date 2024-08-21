package Arrays;

public class FindMissingNumber
{
    public static void main(String[] args)
    {
//        int[] arr={10,9,6,4,2,3,5,7,0,1};
        int[] arr={0,1,3,5,2,4};
        int n=arr.length;
        int ans=MissingNumber(arr,n);
        System.out.println("The missing number is: "+ans);
    }

    public static int MissingNumber(int[] arr,int n)
    {
     int expectedSum=(n*(n+1))/2;
     int actualSum=0;
     for (int i=0;i<n;i++)
     {
         actualSum+=arr[i];
     }

     int missingNumber=expectedSum-actualSum;
     return missingNumber;
    }
}
