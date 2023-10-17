/*
Q7  Write abstract class program to calculate area of circle, rectangle and triangle.
*/

import java.util.Scanner;

public class Abstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        System.out.print("Enter radius of circle: ");
        double rd = scanner.nextDouble();
        System.out.print("Enter value of pie: ");
        double p = scanner.nextDouble();

        System.out.print("Enter length of rectangle: ");
        double l = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double b1 = scanner.nextDouble();

        System.out.print("Enter base of triangle: ");
        double b = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double h = scanner.nextDouble();

        c.area(rd,p);
        r.area(l,b1);
        t.area(b,h);
    }
}

abstract class Shape {
    abstract void area(double x , double y);
}

class Circle extends Shape {

    void area(double r,double p) {
        System.out.println("Area of circle: " + p * r * r);
    }
}

class Rectangle extends Shape {

    void area(double l, double b) {
        System.out.println("Area of rectangle: " + l * b);
    }
}

class Triangle extends Shape {

    void area(double b , double h) {
        System.out.println("Area of triangle: " + 0.5 * b * h);
    }
}



/*OUTPUT
Enter radius of circle: 5
Enter value of pie: 3.14
Enter length of rectangle: 5
Enter width of rectangle: 5
Enter base of triangle: 5
Enter height of triangle: 5
Area of circle: 78.5
Area of rectangle: 25.0
Area of triangle: 12.5
*/
