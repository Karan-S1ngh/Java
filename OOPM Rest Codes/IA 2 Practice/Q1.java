/* 
Q.1
Write a Java script. Given three classes: in it, the subclass BoxWeight is used as a super class to create the subclass called Shipment. 
Shipment inherits all of the traits of BoxWeight and Box, and adds a field called Cost, which holds the cost of shipping such a parcel. 
NOTE: Use parameterized constructor for Box, consider dimensions: width, height, depth. Main class would be DemoShipment 
*/

import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public double calculateVolume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    public BoxWeight(double w, double h, double d, double wt) {
        super(w, h, d);
        weight = wt;
    }

    public double getWeight() {
        return weight;
    }
}

class Shipment extends BoxWeight {
    double cost;

    public Shipment(double width, double height, double depth, double weight, double c) {
        super(width, height, depth, weight);
        cost = c;
    }

    public double getCost() {
        return cost;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width of the shipment: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height of the shipment: ");
        double height = scanner.nextDouble();

        System.out.print("Enter depth of the shipment: ");
        double depth = scanner.nextDouble();

        System.out.print("Enter weight of the shipment in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter cost of shipping: $");
        double cost = scanner.nextDouble();

        Shipment s = new Shipment(width, height, depth, weight, cost);

        double volume = s.calculateVolume();
        double shipmentWeight = s.getWeight();
        double shipmentCost = s.getCost();

        System.out.println("Volume of the shipment: " + volume + " cubic units");
        System.out.println("Weight of the shipment: " + shipmentWeight + " kilograms");
        System.out.println("Cost of shipping: $" + shipmentCost);
    }
}



/*OUTPUT
Enter width of the shipment: 5
Enter height of the shipment: 6
Enter depth of the shipment: 4
Enter weight of the shipment in kilograms: 300
Enter cost of shipping: $200
Volume of the shipment: 120.0 cubic units
Weight of the shipment: 300.0 kilograms
Cost of shipping: $200.0
*/
