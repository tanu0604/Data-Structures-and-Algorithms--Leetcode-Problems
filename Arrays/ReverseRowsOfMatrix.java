package Arrays;

public class ReverseRowsOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        System.out.println(" ");
        System.out.println("After reversing rows: ");
        int[][] reversed=ReverseRows(matrix);
        printMatrix(reversed);
    }

    public static int[][] ReverseRows(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length/2; j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][(matrix[0].length-1)-j];
                matrix[i][(matrix[0].length-1)-j]=temp;

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
