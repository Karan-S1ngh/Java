// Program to sort array elements in ascending order

import java.util.Scanner;

class Sort {    
    public static void main(String[] args) { 
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter number of array elements");
        int n = s.nextInt();
        
        System.out.println("Enter array elements");
        //Initialize array     
        int [] a = new int [n];     
        for (int i = 0; i < n ; i++){
            a[i] = s.nextInt();
        }

        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < n; i++) {     
            System.out.print(a[i] + " ");    
        }    
          
        int temp = 0;  
        //Sort the array in ascending order    
        for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        // (a.length = n)
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");    
        }    
    }    
}  


/*OUTPUT
Enter number of array elements
5
Enter array elements
5 1 4 2 3
Elements of original array: 
5 1 4 2 3 
Elements of array sorted in ascending order: 
1 2 3 4 5 
*/
