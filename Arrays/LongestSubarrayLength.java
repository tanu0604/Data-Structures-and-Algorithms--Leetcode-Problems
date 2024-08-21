package Arrays;

public class LongestSubarrayLength
{
    public static void main(String[] args)
    {
//        int[] arr={1, 2, 3, 1, 1, 1, 1};
        int[] arr={1,4,3,3,5,5};
        int k=16;
        int length=FindLength(arr,k);
        System.out.println("The length of the longest sub-array with sum "+ k +" is "+length);
    }

    public static int FindLength(int[] arr, int k) {
        int maxLength = 0;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }

}
