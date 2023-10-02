import java.util.Scanner;

class Calculate {
  int Fibonacci(int count) {
    if (count == 0) {
      return 0;
    }
    // Oth fibonacci is 0

    if (count == 1 || count == 2) {
      return 1;
    } 
    // 1st and 2nd Fibonacci are 1 and 1 only

    // calling function recursively for nth Fibonacci
    return Fibonacci(count - 1) + Fibonacci(count - 2);
  }
}

class Main{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Number of terms");
    int a = s.nextInt();
    Calculate o = new Calculate();
    System.out.print("Fibonacci Series of " + a + " numbers is: \n");
    int i;
    for (i = 0; i < a; i++) {
      System.out.print(o.Fibonacci(i) + " ");
    }
  }
}


/*OUTPUT
Enter the Number of terms
8
Fibonacci Series of 8 numbers is: 
0 1 1 2 3 5 8 13 
*/
