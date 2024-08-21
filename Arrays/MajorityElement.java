//Apply Moore's Voting Algorithm

package Arrays;

public class MajorityElement
{
    public static void main(String[] args)
    {
        int [] nums={2,2,1,1,1,1,2,2};
        int ans=FindMajorityElement(nums);
        System.out.println("The majority element is: "+ans);
    }

    public static int FindMajorityElement(int[] nums)
    {
        int el=0;
        int count=0;
        int cnt=0;
        for (int i = 0; i < nums.length; i++)
        {
            if(count==0)
            {
                el=nums[i];
                count++;
            }
            if(el==nums[i])
            {
                count++;
            }
            else
                count--;
        }

        for (int i = 0; i < nums.length; i++)
        {
            if(el==nums[i])
                cnt++;
        }

       if (cnt>nums.length/2)
           return el;
       return -1;
    }
}
