//https://leetcode.com/problems/rearrange-array-elements-by-sign/

package Arrays;

import java.util.Arrays;

public class RearrangePositiveNegative
{
    public static void main(String[] args)
    {
        int[] nums={3,1,-2,-5,2,-4};
        int[] ans=AlternatePositiveNegative(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] AlternatePositiveNegative(int[] nums)
    {
        int n=nums.length;
        int[] alternative=new int[n];
        int positive=0;
        int negative=1;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]>0)  //means positive
            {
                alternative[positive]=nums[i];
                positive+=2;
            }

            else
            {
                alternative[negative]=nums[i];
                negative+=2;
            }

        }
        return alternative;
    }
}
