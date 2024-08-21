package Arrays;

import java.util.Arrays;

public class RightRotateDplaces
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6,7,8,9};
        int n=a.length;
        int d=28;
        System.out.println("Array before rotation: "+ Arrays.toString(a));
        int [] ans=RightRotation(a,n,d);
        System.out.println("Array after Right rotation only once : "+Arrays.toString(ans));
    }

    public static int[] RightRotation(int[] arr,int n,int d)
    {
        if (d==0 || d%n==0)
        {
            return arr;
        }
        else
        {
            d=d%n;
        }
        for (int i = 0; i < d; i++)
        {
            int temp=arr[n-1];
            for (int j = n-1; j > 0; j--)
            {

                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }

        return arr;
    }



}
