// Program to display multiplication of two matrix

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        // Check if matrix multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        } else {
            int[][] matrixA = new int[rowsA][colsA];
            int[][] matrixB = new int[rowsB][colsB];
            int[][] resultMatrix = new int[rowsA][colsB];

            // Input elements for the first matrix
            System.out.println("Enter elements for the first matrix:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    matrixA[i][j] = scanner.nextInt();
                }
            }

            // Input elements for the second matrix
            System.out.println("Enter elements for the second matrix:");
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    matrixB[i][j] = scanner.nextInt();
                }
            }

            // Perform matrix multiplication
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            // Display the first matrix
            System.out.println("First Matrix:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
            }

            // Display the second matrix
            System.out.println("Second Matrix:");
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(matrixB[i][j] + "\t");
                }
                System.out.println();
            }

            // Display the result matrix
            System.out.println("Resultant Matrix after multiplication:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(resultMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}




/*OUTPUT
Enter the number of rows for the first matrix: 2
Enter the number of columns for the first matrix: 2
Enter the number of rows for the second matrix: 3
Enter the number of columns for the second matrix: 3
Matrix multiplication is not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.




Enter the number of rows for the first matrix: 2
Enter the number of columns for the first matrix: 3
Enter the number of rows for the second matrix: 3
Enter the number of columns for the second matrix: 1
Enter elements for the first matrix:
1 2 3 4 5 6
Enter elements for the second matrix:
7 8 9
First Matrix:
1	2	3	
4	5	6	
Second Matrix:
7	
8	
9	
Resultant Matrix after multiplication:
50	
122	
*/
