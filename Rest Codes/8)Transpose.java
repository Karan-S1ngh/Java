import java.util.Scanner;

class MatrixTranspose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get the number of rows and columns for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = s.nextInt();

        // Initialize the matrix with user-defined values
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        // Calculate the transpose of the matrix
        int[][] transposeMatrix = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Print the transpose of the matrix
        System.out.println("Transpose Matrix:");
        printMatrix(transposeMatrix);

    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*OUTPUT
Enter the number of rows: 2
Enter the number of columns: 2
Enter the elements of the matrix:
1 2 3 4
Original Matrix:
1 2 
3 4 
Transpose Matrix:
1 3 
2 4 */
