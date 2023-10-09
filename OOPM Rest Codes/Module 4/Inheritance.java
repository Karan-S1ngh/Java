import java.util.Scanner;

class Student {
    int roll;
    Scanner sc = new Scanner(System.in);

    void getRoll() {
        System.out.println("Enter roll no");
        roll = sc.nextInt();
    }
}

class Test extends Student {
    int m1, m2;
    Scanner sc = new Scanner(System.in);

    void getMarks() {
        System.out.println("Enter marks of 2 subjects");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
    }
}

interface Sports {
    float m = 5.8f;

    void puts();
}

class Result extends Test implements Sports {
    float total;

    public void puts() {
        System.out.println("Sports marks = " + m);
    }

    void calculateTotal() {
        total = m1 + m2 + m;
    }

    void display() {
        System.out.println("Roll No = " + roll);
        System.out.println("Marks1 = " + m1);
        System.out.println("Marks2 = " + m2);
        System.out.println("Sports marks = " + m);
        System.out.println("Total = " + total);
    }
}

class MainClass {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.getRoll();
        r1.getMarks();
        r1.puts();
        r1.calculateTotal();
        r1.display();
    }
}



/*OUTPUT
Enter roll no
5
Enter marks of 2 subjects
20 20
Sports marks = 5.8
Roll No = 5
Marks1 = 20
Marks2 = 20
Sports marks = 5.8
Total = 45.8
*/