// Program to calculate sum and average of array elements

import java.util.Scanner;

class Main{
    public static void main(String [] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter number of Array Elements");
        int n = s.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        
        int sum=0;
        for (int i = 0; i < n; i++){
            sum = sum + a[i];
        }
        float average = (float)sum/n;
        
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}


/*OUTPUT
Enter number of Array Elements
5
Enter Array Elements
1 2 3 4 5
Sum = 15
Average = 3.0
*/
