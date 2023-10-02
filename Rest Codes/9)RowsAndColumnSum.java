import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display input matrix
        System.out.println("Input Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate sum of rows
        int[] rowSums = new int[rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSums[i] += matrix[i][j];
            }
        }

        // Calculate sum of columns
        int[] colSums = new int[cols];
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                colSums[j] += matrix[i][j];
            }
        }

        // Display sum of rows
        System.out.println("Sum of rows:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }

        // Display sum of columns
        System.out.println("Sum of columns:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Column " + (j + 1) + ": " + colSums[j]);
        }
    }
}


/*OUTPUT
Enter the number of rows: 3
Enter the number of columns: 3
Enter matrix elements:
1 2 3 4 5 6 7 8 9
Input Matrix:
1	2	3	
4	5	6	
7	8	9	
Sum of rows:
Row 1: 6
Row 2: 15
Row 3: 24
Sum of columns:
Column 1: 12
Column 2: 15
Column 3: 18
*/