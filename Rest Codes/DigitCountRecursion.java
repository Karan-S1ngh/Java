import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int num) {
        // Base case: If the number is less than 10, it has 1 digit
        if (num < 10) {
            return 1;
        } 
        else {
            // Recursive case: Remove the last digit and count the rest
            return 1 + countDigits(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);
    }
}


/*OUTPUT
Enter an integer: 456
Number of digits in 456: 3

Enter an integer: 29
Number of digits in 29: 2

Enter an integer: 1234567890
Number of digits in 1234567890: 10
*/
