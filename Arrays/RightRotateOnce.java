package Arrays;

import java.util.Arrays;

public class RightRotateOnce
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int n=a.length;
        System.out.println("Array before rotation: "+ Arrays.toString(a));
        int [] ans=RightRotation(a,n);
        System.out.println("Array after Right rotation only once : "+Arrays.toString(ans));
    }

    public static int[] RightRotation(int[] arr,int n)
    {

        int temp=arr[n-1];
        for (int i = n-1; i > 0; i--)
        {

            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }



}
