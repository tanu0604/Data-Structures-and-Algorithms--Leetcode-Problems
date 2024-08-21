package Arrays;

public class RemoveDuplicates
{
    public static void main(String[] args) {
        int[] arr={1,1,2,3};
        int n= arr.length;
        int ans=RemoveDuplicateElements(arr,n);
        System.out.println(ans);    }
    public static int RemoveDuplicateElements(int[] arr,int n)
    {
        int i=0;
        for (int j=0;j<n;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

}
