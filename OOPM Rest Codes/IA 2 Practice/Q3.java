/*
Q3
Consider a university where students who participate in the National Games or Olympics are given some grace marks. 
The grace marks provided are fixed and same for every student. 
Create an application that keeps student’s academic marks and Sports grace marks separate and generate total of marks considering academics and sports both. 
Also invoke methods of base class & interface using reference
(Experiment 9)
*/

import java.util.Scanner;

class Student {
    int roll;
    Scanner sc = new Scanner(System.in);
    void getNumber() {
        System.out.println("Enter Roll Number");
        roll = sc.nextInt();
    }
    void putNumber(){
        System.out.println("Roll Number = " + roll);
    }
}

class Test extends Student {
    int a;
    Scanner sc = new Scanner(System.in);
    void getMarks(){
        System.out.println("Enter Academic Marks");
        a = sc.nextInt();
    }
    void putMarks(){
        System.out.println("Academic Marks = " + a);
    }
}

interface Sports {
    float m = 5.5f; 
    void putscore();
}

class Result extends Test implements Sports {
    float total;
    public void putscore(){
                System.out.println("Sports Marks = " + m);
    }
    void calculateTotal() {
        total = a + m;
        System.out.println("Total Marks = " + total);
    }
    void display(){
    putNumber();
    putMarks();
    putscore();
    calculateTotal();
    }
}

class MainClass {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.getNumber();
        r1.getMarks();
        System.out.println("MARKS INFORMATION");
        r1.display();
    }
}




/*OUTPUT
Enter Roll Number
1
Enter Academic Marks
30
MARKS INFORMATION
Roll Number = 1
Academic Marks = 30
Sports Marks = 5.5
Total Marks = 35.5
*/
