package Arrays;

public class MaximumSubarraySum
{
    public static void main(String[] args)
    {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        int sum=FindMaxSum(nums);
        System.out.println("The maximum sub-array sum is: "+sum);
    }

    public static int FindMaxSum(int [] nums)
    {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length; i++)
        {
            sum+=nums[i];

            if(sum>maxi)
                maxi=sum;

            if(sum<0)
                sum=0;

        }
        return maxi;
    }
}
