package Arrays;

import java.util.Arrays;

public class LeftRotateOnce
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int n=a.length;
        System.out.println("Array before rotation: "+ Arrays.toString(a));
        int [] ans=LeftRotation(a,n);
        System.out.println("Array after left rotation only once : "+Arrays.toString(ans));
    }

    public static int[] LeftRotation(int[] arr,int n)
    {

        int temp=arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }



}
