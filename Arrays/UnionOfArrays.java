package Arrays;

import java.util.Arrays;

public class UnionOfArrays
{
    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 3, 4, 6};
        int[] nums2 = {1, 2, 3, 4, 5, 7};
        int[] union = FindUnionArray(nums1, nums2);
        System.out.println("The first array is: "+Arrays.toString(nums1));
        System.out.println("The second array is: "+Arrays.toString(nums2));
        System.out.println("The union of the two arrays are: "+Arrays.toString(union));

    }

    public static int[] FindUnionArray(int[] n, int[] m)
    {
        int i = 0, j = 0, k = 0;
        int[] tempUnion = new int[n.length + m.length]; // maximum possible size

        while (i < n.length && j < m.length)
        {
            if (n[i] == m[j])
            {
                tempUnion[k++] = n[i];
                i++;
                j++;
            }
            else if (n[i] < m[j])
            {
                tempUnion[k++] = n[i++];
            }
            else
            {
                tempUnion[k++] = m[j++];
            }
        }

        while (i < n.length)
        {
            tempUnion[k++] = n[i++];
        }

        while (j < m.length)
        {
            tempUnion[k++] = m[j++];
        }

        // Resize the union array to the actual size used
        int[] union = Arrays.copyOf(tempUnion, k);

        return union;
    }
}
