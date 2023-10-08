import java.util.*;

class ComplexNumber{
   //for real and imaginary parts of complex numbers
   double real, img;

   //constructor to initialize the complex number
   ComplexNumber(double r, double i){
	this.real = r;
	this.img = i;
   }

   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        ComplexNumber o = new ComplexNumber(0,0);
        o.real = c1.real + c2.real;
        o.img = c1.img + c2.img;
        //returning the output complex number
        return o;
    }

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
	        ComplexNumber c1 = new ComplexNumber(r1, i1);
    	        ComplexNumber c2 = new ComplexNumber(r2, i2);
                ComplexNumber o = sum(c1, c2);
                System.out.println("First Number is: "+ c1.real+" + "+ c1.img +"i");
                System.out.println("Second Number is: "+ c2.real+" + "+ c2.img +"i");
                System.out.println("Sum is: "+ o.real+" + "+ o.img +"i");
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
*/
