//https://leetcode.com/problems/3sum/description/

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum
{
    public static void main(String[] args)
    {
        int [] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> ans =threeSum(nums);
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }
    }

    public static List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums); // Sort the array first

        for (int i = 0; i < nums.length - 2; i++)
        {
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0)
                {
                    j++;
                }
                else if (sum > 0)
                {
                    k--;
                }
                else
                {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicate elements
                    while (j < k && nums[j] == nums[j + 1])
                    {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1])
                    {
                        k--;
                    }

                    // Move both pointers
                    j++;
                    k--;
                }
            }
        }

        return ans;
    }
}
