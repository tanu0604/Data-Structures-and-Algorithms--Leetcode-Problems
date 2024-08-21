package Arrays;

import java.util.Arrays;

public class LeftRotateDTimes
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int n=a.length;
        int d=3;
        System.out.println("Array before rotation: "+ Arrays.toString(a));
        int [] ans=LeftRotationDPlaces(a,n,d);
        System.out.println("The array is rotated "+d +" times.");
        System.out.println("Array after left rotation places  : "+Arrays.toString(ans));
    }

    public static int[] LeftRotationDPlaces(int[] arr,int size,int d)
    {
        for (int i=0;i<d;i++)
        {
            int temp=arr[0];
            for (int j = 1; j < arr.length; j++)
            {
                arr[j-1]=arr[j];
            }
            arr[size-1]=temp;
        }

        return arr;
    }
}
