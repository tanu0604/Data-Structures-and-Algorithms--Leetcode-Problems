//https://leetcode.com/problems/search-insert-position/description/

package BinarySearch;

public class SeachInsertPosition
{
    public static void main(String[] args)
    {
        int[] nums={1,3,5,6};
        int target=4;
        int insertPosition=SearchIndex(nums,target);
        System.out.println("The insert position is: "+insertPosition);
    }

    public static int SearchIndex(int[]nums,int target)
    {
        int n=nums.length;
        int ans=0;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                return ans;
            }

            else if(nums[mid]>target)
            {
                end=mid-1;
            }

            else
            {
                start=mid+1;
            }
        }
        return start;
    }

}
