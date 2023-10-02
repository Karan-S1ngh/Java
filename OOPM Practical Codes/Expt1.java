import java.util.*;

class Marks   {
	public static void main(String[] args) 	{
		Scanner n= new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int a=n.nextInt();
		a=a/10;
		switch(a)    {
			case 0:System.out.println("Fail");
			       	 break;
			case 1:System.out.println("Fail");
			       	 break;
			case 2:System.out.println("Fail");
			       	 break;
			case 3:System.out.println("Fail");
			       	 break;
			case 4:System.out.println("Pass");
			      	  break;
			case 5:System.out.println("Second class");
			       	 break;
			case 6:System.out.println("First class");
			 break;
			case 7:System.out.println("Distinction");
			       	 break;
			case 8:System.out.println("Distinction");
			        	break;
			case 9:System.out.println("Distinction");
			        	break;
			case 10:System.out.println("Distinction");
			        	break;
			default:System.out.println("Invalid Input");
					}
				}
			}




/*OUTPUT
Enter the marks: 34
Fail

Enter the marks: 45
Pass

Enter the marks: 56
Second class

Enter the marks: 67
First class

Enter the marks: 96
Distinction
*/
