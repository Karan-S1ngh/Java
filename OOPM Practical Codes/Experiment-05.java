import java.util.*;

class ComplexNumber{
    public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	
	System.out.printf("Enter real part of first number: ");
	double r1=s.nextDouble();
	
	System.out.printf("Enter imaginary part of first number: ");
	double i1=s.nextDouble();
	
	System.out.printf("Enter real part of second number: ");
	double r2=s.nextDouble();
	
	System.out.printf("Enter imaginary part of second number: ");
	double i2=s.nextDouble();
	
	double r3 = r1 + r2;
	double i3 = i1 + i2;
	
    System.out.println("First Number is: "+ r1+" + "+ i1 +"i");
    System.out.println("Second Number is: "+ r2+" + "+ i2 +"i");
    System.out.println("Sum is: "+ r3+" + "+ i3 +"i");
    }
}




/*OUTPUT
Enter real part of first number: 1
Enter imaginary part of first number: 2
Enter real part of second number: 9
Enter imaginary part of second number: 4
First Number is: 1.0 + 2.0i
Second Number is: 9.0 + 4.0i
Sum is: 10.0 + 6.0i


Enter real part of first number: 1
Enter imaginary part of first number: -2
Enter real part of second number: -9
Enter imaginary part of second number: 4
First Number is: 1.0 + -2.0i
Second Number is: -9.0 + 4.0i
Sum is: -8.0 + 2.0i
*/
