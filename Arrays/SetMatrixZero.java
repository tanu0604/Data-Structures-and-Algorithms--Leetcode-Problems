//https://leetcode.com/problems/set-matrix-zeroes/

package Arrays;

import java.util.Arrays;

public class SetMatrixZero
{
    public static void main(String[] args)
    {

        int [][] matrix={
                {1,1,1},
                {0,0,1},
                {1,1,0}
        };

        int [][] ans=setZeroes(matrix);
        for (int i = 0; i < ans.length; i++)
        {
            for (int j = 0; j < ans[0].length; j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] setZeroes(int[][] matrix)
    {
        int n= matrix.length;
        int m=matrix[0].length;

        int[] row=new int[n];
        int[] col=new int[m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
             if(matrix[i][j]==0)
             {
                 row[i]=1;
                 col[j]=1;
             }
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (row[i]==1 || col[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }

        return matrix;
    }
}
