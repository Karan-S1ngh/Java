import java.util.*;

class Circle {
    double radius;
    void acceptRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }
}

class Area extends Circle {
    double calculate() {
        return Math.PI * radius * radius;
    }
    void display() {
        System.out.println("Area of the circle: " + calculate());
    }
}

class Volume extends Area {
    double calculateSphereVolume() {
        return (4.0 / 3.0) * 3.14 *radius*radius*radius;
    }
    void display() {
        System.out.println("Volume of the sphere: " + calculateSphereVolume());
    }
}

class Main{
    public static void main(String[] args) {
        
        Volume sphere = new Volume();

        sphere.acceptRadius(); 
        sphere.display();     
    }
}


/*OUTPUT
Enter the radius of the circle: 5
Volume of the sphere: 523.3333333333334


Enter the radius of the circle: 3.5
Volume of the sphere: 179.50333333333333
*/
