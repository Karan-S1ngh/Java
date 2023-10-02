import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = s.nextInt();
        Calculate f = new Calculate();
        if(num >= 0){
            System.out.println("Factorial is : " + f.Factorial(num));
        }
        else{
            System.out.println("Factorial is not possible");
            System.out.println("Enter a valid number");
        }
    }
}

class Calculate{
    int Factorial(int n){
        if(n == 0){
            return 1;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return n*Factorial(n - 1);
        }
    }
}



/*OUTPUT
Enter Number
5
Factorial is : 120


Enter Number
9
Factorial is : 362880
*/
