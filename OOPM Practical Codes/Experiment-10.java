import java.util.Scanner;
//Create custom exception OddException
class OddException extends Exception {
    int num;

    // Constructor to get input number
    public OddException(int num) {
        num = num; // Assigning the local variable num to the instance variable num
    }
}

// Create a class MyExceptionDemo
class MyExceptionDemo {
    // Write a static function to throw OddException
    public static void OddNoException(int num) throws OddException {
        if (num % 2 != 0) {
            throw new OddException(num);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = s.nextInt();
        try {
            // Invoke OddNoException() in try block
            MyExceptionDemo.OddNoException(x);
            // Calculate and print square if the number is even
            int square = x * x;
            System.out.println("Square of the number: " + square);
        } catch (OddException e) {
            // Catch and print the custom exception message
            System.out.println("OddException: Input number must be even, but got odd number");
        }
    }
}



/*OUTPUT
Enter a number: 5
OddException: Input number must be even, but got odd number

Enter a number: 12
Square of the number: 144
*/
