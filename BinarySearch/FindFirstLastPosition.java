package BinarySearch;

import java.util.Arrays;

public class FindFirstLastPosition
{
    public static void main(String[] args)
    {
        int [] nums={1,2,3,7,7,8,8,8,8,8,9};
        int target=8;
        int first=FindFirst(nums,target);
        int last=FindLast(nums,target);
        int[] indexes=new int[2];
        indexes[0]=first;
        indexes[1]=last;
        System.out.println("First index of the given target is: "+first);
        System.out.println("Last index of the given target is: "+last);

        System.out.println("The arrays containing the first and last index of the given target is: "+ Arrays.toString(indexes));
    }
        public static int  FindFirst(int[] nums, int target)
        {
            int start = 0;
            int end = nums.length - 1;
            int first = -1;
            while (start <= end)
            {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target)
                {
                    first = mid;
                    end = mid - 1; // Move left to find the first occurrence
                }
                else if (nums[mid] < target)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }

            return first;
        }

        public static int FindLast(int[] nums, int target)
        {
            int start = 0;
            int end = nums.length - 1;
            int last = -1;

            while (start <= end)
            {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target)
                {
                    last = mid;
                    start = mid + 1; // Move right to find the last occurrence
                }
                else if (nums[mid] > target)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }

            return last;
        }
    }

}
