//https://leetcode.com/problems/spiral-matrix/

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix
{
    public static void main(String[] args)
    {
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        List<Integer> ans = printSpiral(mat);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }

    public static List<Integer> printSpiral(int[][] matrix)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;
        int i;

        while(top<=bottom && left<=right)
        {
            //Left to right
            for(i=left;i<=right;i++)
            {
                arr.add(matrix[top][i]);
            }

            top++;

            //top to bottom

            for(i=top;i<=bottom;i++)
            {
                arr.add(matrix[i][right]);
            }

            right--;

            //right to left
            if(top<=bottom)
            {
                for(i=right;i>=left;i--)
                {
                    arr.add(matrix[bottom][i]);
                }

                bottom--;
            }
            //bottom to top
            if(left<=right)
            {
                for(i=bottom;i>=top;i--)
                {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}
