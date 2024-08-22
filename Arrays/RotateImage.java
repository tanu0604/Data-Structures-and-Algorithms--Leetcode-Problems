//https://leetcode.com/problems/rotate-image/

package Arrays;

public class RotateImage
{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

       int [] [] ansMatrix=RotateImage90Deg(matrix);
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(ansMatrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static int [][] RotateImage90Deg(int[][] mat)
    {
        //Step 1. Find the transpose of the given matrix.

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = i; j < mat[0].length; j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        //Step 2: Reverse the columns of the matrix

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length/2; j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[i][(mat[0].length-1)-j];
                mat[i][(mat[0].length-1)-j]=temp;
            }
        }

        return mat;
    }

}
