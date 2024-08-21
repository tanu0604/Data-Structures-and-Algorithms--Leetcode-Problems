package Arrays;

public class MaxConsecutiveOnes
{
    public static void main(String[] args)
    {
        int[] nums={1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,0};
//        int [] nums={0,0,0};
//        int[] nums={1,1,0,1,1,1};
        int ans=FindMaxConsecutiveOnes(nums);
        System.out.println("The maximum consecutive ones are: "+ans +" times.");
    }

    public static int FindMaxConsecutiveOnes(int[] nums)
    {
        int ans=Integer.MIN_VALUE;
        int count=0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]==1)
            {
                count++;
            }

            else
            {
                count=0;
            }

            ans=Math.max(ans,count);

        }
        return ans;
    }
}
