import java.util.*;
class MatrixOperations {
public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of rows of both Matrix   ");
		int r=s.nextInt();
		System.out.print("Enter the number of columns of both Matrix   ");
		int c=s.nextInt();
		int[][] a = new int[r][c];
		int[][] b = new int[r][c];
		All o=new All();
		System.out.print("Enter the elements of Matrix1   ");
		o.read(a,r,c);
		System.out.print("Enter the elements of Matrix2   ");
		o.read(b,r,c);
		boolean exit=false;
		do {
		 System.out.println("Choose an operation: ");
     System.out.println("1. Matrix Addition ");
     System.out.println("2. Matrix1 Transpose ");
     System.out.println("3. Matrix2 Transpose ");
     System.out.println("4. Display Matrix1 ");
     System.out.println("5. Display Matrix2 ");
     System.out.println("6. Transpose of Sum of Matrix1 and Matrix2 ");
     System.out.println("7. Addition of Transposes of Matrix1 and Matrix2 ");
     System.out.println("8.Exit ");
	   int choice = s.nextInt();
		 int[][] sum = o.addition(a,b,r,c);
		 int[][] t1 = o.transpose(a,r,c);
		 int[][] t2 = o.transpose(b,r,c);
		 int[][] transposeofsum = o.transpose(sum,r,c);
		 int[][] sumoftranspose = o.addition(t1,t2,r,c);
	   switch(choice){
	        case 1: System.out.println("Matrix1 and Matrix 2 Addition ");
		              o.display(sum,c,r);
	                break;
	        case 2: System.out.println("Matrix1 After Transpose ");
        		      o.transpose(t1,r,c);
		              break;
	        case 3: System.out.println("Matrix2 After Transpose ");
		              o.display(t2,r,c);
		              break;
	        case 4: System.out.println("Matrix1:");
		              o.display(a,r,c);
		              break;
	        case 5: System.out.println("Matrix2:");
		              o.display(b,r,c);
		              break;
	        case 6: System.out.println("Transpose of Addition of Matrix1 and Matrix2 ");
		              o.display(transposeofsum,c,r);
		              break;
	        case 7: System.out.println("Addition of Transpose of Matrix1 and Transpose of Matrix2 ");
		              o.display(sumoftranspose,r,c);
		              break;
	        case 8: System.out.println("Exiting the program.");
                  exit = true;
                  break;
          default: System.out.print("   Invalid choice. Please enter a valid option.");
	      }
	   System.out.println();
	  } while(!exit);
  }
}


class All{ 
  
void read(int a[][],int r,int c){
      Scanner s=new Scanner(System.in);
      for (int i = 0; i < r; i++) {
          for (int j = 0; j < c; j++) {
	 	              a[i][j] = s.nextInt() ;
              }
        }
  }
  
int[][] transpose(int a[][],int r,int c){
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
	                      t[j][i] = a[i][j];
                  }               
              System.out.println();
          }     
      return t;
  }
  
int[][] addition(int a[][], int b[][],int r,int c){
  int sum[][]=new int[r][c];
	for (int i = 0; i < r; i++) {
	     for (int j = 0; j < c; j++) {
	             sum[i][j]=a[i][j] + b[i][j];		
	        }	
        System.out.println();
      }        
    return sum;
  }
  
void display(int a[][], int r,int c){
           for (int i = 0; i < r; i++) {
	              for (int j = 0; j < c; j++) {
                         System.out.print(a[i][j]+" ");
	              }           
             System.out.println();
          }
    }    
}

/*OUTPUT
Enter the number of rows of both Matrix   2
Enter the number of columns of both Matrix   2
Enter the elements of Matrix1   1 2 3 4
Enter the elements of Matrix2   1 2 3 4
Choose an operation: 
1. Matrix Addition 
2. Matrix1 Transpose 
3. Matrix2 Transpose 
4. Display Matrix1 
5. Display Matrix2 
6. Transpose of Sum of Matrix1 and Matrix2 
7. Addition of Transposes of Matrix1 and Matrix2 
8.Exit 
4
Matrix1:
1 2 
3 4 

Choose an operation: 
1. Matrix Addition 
2. Matrix1 Transpose 
3. Matrix2 Transpose 
4. Display Matrix1 
5. Display Matrix2 
6. Transpose of Sum of Matrix1 and Matrix2 
7. Addition of Transposes of Matrix1 and Matrix2 
8.Exit 
3
Matrix2 After Transpose 
1 3 
2 4 

Choose an operation: 
1. Matrix Addition 
2. Matrix1 Transpose 
3. Matrix2 Transpose 
4. Display Matrix1 
5. Display Matrix2 
6. Transpose of Sum of Matrix1 and Matrix2 
7. Addition of Transposes of Matrix1 and Matrix2 
8.Exit 
1
Matrix1 and Matrix 2 Addition 
2 4 
6 8 

Choose an operation: 
1. Matrix Addition 
2. Matrix1 Transpose 
3. Matrix2 Transpose 
4. Display Matrix1 
5. Display Matrix2 
6. Transpose of Sum of Matrix1 and Matrix2 
7. Addition of Transposes of Matrix1 and Matrix2 
8.Exit 
6
Transpose of Addition of Matrix1 and Matrix2 
2 6 
4 8 

Choose an operation: 
1. Matrix Addition 
2. Matrix1 Transpose 
3. Matrix2 Transpose 
4. Display Matrix1 
5. Display Matrix2 
6. Transpose of Sum of Matrix1 and Matrix2 
7. Addition of Transposes of Matrix1 and Matrix2 
8.Exit 
7
Addition of Transpose of Matrix1 and Transpose of Matrix2 
2 6 
4 8 

Choose an operation: 
1. Matrix Addition 
2. Matrix1 Transpose 
3. Matrix2 Transpose 
4. Display Matrix1 
5. Display Matrix2 
6. Transpose of Sum of Matrix1 and Matrix2 
7. Addition of Transposes of Matrix1 and Matrix2 
8.Exit 
9   Invalid choice. Please enter a valid option.

Choose an operation: 
1. Matrix Addition 
2. Matrix1 Transpose 
3. Matrix2 Transpose 
4. Display Matrix1 
5. Display Matrix2 
6. Transpose of Sum of Matrix1 and Matrix2 7. Addition of Transposes of Matrix1 and Matrix2 
8.Exit 
8
Exiting the program.
*/
