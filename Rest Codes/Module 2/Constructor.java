import java.util.Scanner;

public class Rectangle {
    Rectangle(int l , int b){
        System.out.println("Area : " + l*b);
        System.out.println("Perimeter : " + 2*(l+b));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle");
        int l = s.nextInt();
        System.out.println("Enter Breadth of Rectangle");
        int b = s.nextInt();
        Rectangle r = new Rectangle(l,b);
    }
}

/*OUTPUT
Enter Length of Rectangle
5
Enter Breadth of Rectangle
10
Area : 50
Perimeter : 30
*/
