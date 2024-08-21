package Arrays;

import java.util.Arrays;

public class MoveZeroToEnd
{
    public static void main(String[] args)
    {
        int [] arr={0,1,0,4,12,12,2,3,5,6,0,1,1,0,1,8,0,1,9,0,0,7,9,0,5};
        int n=arr.length;
        arr=MoveZero(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] MoveZero(int[] nums,int n)
    {
        int count=0;
        //First count the number of non-zero elements
        for (int i = 0; i < n; i++)
        {
            if(nums[i]!=0)
                count++;
        }

        //Make nums temporary array and store the non-zero elements

        int [] temp=new int[count];
        int index=0;
        for (int i = 0; i < n; i++)
        {
            if(nums[i]!=0)
            {
                temp[index]=nums[i];
                index++;
            }
        }
        for (int i=0;i<count;i++)
        {
            nums[i]=temp[i];
        }

        for (int i = count; i < n; i++)
        {
            nums[i]=0;
        }
        return nums;

    }
}
