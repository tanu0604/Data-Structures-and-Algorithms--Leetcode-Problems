//https://leetcode.com/problems/binary-search/description/

package BinarySearch;

public class binarysearch
{
    public static void main(String[] args)
    {
        int[] nums={-1,0,3,5,9,12};
//        int[] nums={9,9,9,9};
        int target=9;
        int returnSearchIndex=binarySearch(nums,target);
        System.out.println("The search value "+target+ " is at index: "+returnSearchIndex);
    }

    public static int binarySearch(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (nums[mid]<target)
                start=mid+1;
            else if(nums[mid]>target)
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
