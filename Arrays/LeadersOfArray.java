//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersOfArray
{
    public static void main(String[] args)
    {
        int[] arr={6,5,4,3,2,1};
        int n=arr.length;
        ArrayList<Integer> ans= FindLeaders(arr,n);
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(ans.get(i)+" ");

        }
    }

    public static ArrayList<Integer> FindLeaders(int[] arr, int n)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for (int i = n-1; i >=0; i--)
        {
            if (arr[i]>maxi)
                ans.add(arr[i]);
            maxi=Math.max(maxi,arr[i]);

        }
        Collections.sort(ans, Collections.reverseOrder());
        return ans;

    }
}
