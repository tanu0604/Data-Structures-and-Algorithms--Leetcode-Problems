package Arrays;

public class MatrixTranspose
{
    public static void main(String[] args)
    {
        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Original Matrix: ");
        printMatrix(matrix);

        int[][] ansMatrix=TransposeOfMatrix(matrix);
        System.out.println("After transpose: " );
        printMatrix(ansMatrix);
    }
    public static int[][] TransposeOfMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = i; j < matrix[0].length; j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
