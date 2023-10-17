/*
Q5
A character sequence is to be read as an input and result need to declare as “yes” or “no” 
by investigating the fact that traversing the characters sequence backwards and forwards results in same sequence. 
Write a program for the same using StringBuffer
(Experiment 7)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str, rev;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = s.nextLine();
        StringBuffer str1 = new StringBuffer(str);
        str1.reverse();
        rev = str1.toString();
        if (str.equals(rev)) {            
            System.out.println("Yes");
        } 
        else {            
            System.out.println("No");
        }
    }
}
//The input will be case senstivie therefore A will not be equal to a




/*OUTPUT
Enter a string:
Karan
No


Enter a string:
WOW
Yes

Enter a string:
Wow
No
*/
