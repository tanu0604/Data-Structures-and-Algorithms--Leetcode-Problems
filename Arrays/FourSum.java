package Arrays;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FourSum
{
    public static void main(String[] args)
    {
        int[] nums = {2,2,2,2,2,2};
        int target=8;
        List<List<Integer>> ans = Foursum(nums,target);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    public static List<List<Integer>> Foursum(int[] nums,int target)
    {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++)
            {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l)
                {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];  // Use long to avoid overflow
                    if (sum == target)
                    {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }
                    else if (sum < target)
                    {
                        k++;
                    } else
                    {
                        l--;
                    }
                }
            }
        }
        return ans;
    }

}
