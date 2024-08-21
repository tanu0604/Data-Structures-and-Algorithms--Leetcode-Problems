package Arrays;

public class SingleNumber
{
    public static void main(String[] args)
    {
        int [] arr={4,1,2,2,1,4,6};
        int ans=FindSingleElement(arr);
        System.out.println("The single element present in the array is: "+ans);
    }

    public static int FindSingleElement(int[] arr)
    {
        int ans=0;
        for (int i = 0; i < arr.length; i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
}
