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
            System.out.println("Yes, \"" + str + "\" is a palindrome.");
        } 
        else {            
            System.out.println("No, \"" + str + "\" is not a palindrome.");
        }
    }
}


//The input will be case senstivie therefore A will not be equal to a

/*OUTPUT
Enter a string:
Karan
No, "Karan" is not a palindrome.


Enter a string:
WOW
Yes, "WOW" is a palindrome.


Enter a string:
Wow
No, "Wow" is not a palindrome.
*/
