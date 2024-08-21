package Arrays;

import java.util.Arrays;

public class SortColours
{
    public static void main(String[] args)
    {
        int[] nums={2,0,2,1,1,0};
        nums=Sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] Sort(int[] nums)
    {
        int cntZero=0;
        int cntOne=0;
        int cntTwo=0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]==0)
                cntZero++;
            else if (nums[i]==1)
                cntOne++;
            else
                cntTwo++;
        }

        for (int i = 0; i < cntZero; i++)
        {
            nums[i]=0;
        }

        for (int i = cntZero; i < cntOne+cntZero; i++)
        {
            nums[i]=1;
        }

        for (int i = cntZero+cntOne; i <nums.length ; i++)
        {
            nums[i]=2;
        }

        return nums;
    }
}
