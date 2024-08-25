//https://leetcode.com/problems/majority-element-ii/description/


package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElements2
{
    public static void main(String[] args)
    {
        int[] arr={1,1,1,3,3,2,2,2};
        List<Integer> ans=FindMajorityElements(arr);
        for (int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }

    public static List<Integer> FindMajorityElements(int[]arr)
    {
        List<Integer> elements=new ArrayList<>();
        int count1=0,count2=0,ele1=0,ele2=0;
        int n= arr.length;
        for (int i = 0; i <n ; i++)
        {
            if(count1==0 && arr[i]!=ele2)
            {
                count1=1;
                ele1=arr[i];
            }
            else if(count2==0 && arr[i]!=ele1)
            {
                count2=1;
                ele2=arr[i];
            }
            else if(ele1==arr[i])
            {
                count1++;
            } else if (ele2==arr[i])
            {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        int c1=0,c2=0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]==ele1)
                c1++;
            if(arr[i]==ele2)
                c2++;
        }

        int mini=(int)(n/3)+1;
        if(c1>=mini)
            elements.add(ele1);
        if(c2>=mini)
            elements.add(ele2);
        return elements;
    }
}
