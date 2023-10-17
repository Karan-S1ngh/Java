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
    int sem1, sem2;
    Scanner sc = new Scanner(System.in);
    void getMarks(){
        System.out.println("Enter Marks of Sem 1");
        sem1 = sc.nextInt();
        System.out.println("Enter Marks of Sem 2");
        sem2 = sc.nextInt();
    }
    void putMarks(){
        System.out.println("Sem 1 Marks = " + sem1);
        System.out.println("Sem 2 Marks = " + sem2);        
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
        total = sem1 + sem2 + m;
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
Enter Marks of Sem 1
9
Enter Marks of Sem 2
10
MARKS INFORMATION
Roll No = 1
Sem 1 Marks = 9
Sem 2 Marks = 10
Sports Marks = 5.5
Total Marks = 24.5
*/
