import java.util.*;

class Search
{  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
    	int i,n,search;
		System.out.println("Enter the number of elements:") ;
 		n = sc.nextInt();
		int[] a = new int[n];
 
    		System.out.println("Enter the elements") ;
    		for(i=0;i<n;i++)
    		{
        		a[i] = sc.nextInt();
    		}
		
		System.out.println("Enter the element to be seached");
		search = sc.nextInt();
    
    		//Perform search operation
    		int c=0;
    		for(i=0;i<n;i++)
    		{
        		if(a[i]==search)
        		{
            			System.out.println("Element "+search+" found at "+i+" position");
            			c=1;
            			break;
        		}
    		}
    		if(c == 0)
    		{
        		System.out.println("Element "+search+" not found");
    		}
    	
	}
}



/*OUTPUT
Enter the number of elements:
5
Enter the elements
1 2 3 4 5
Enter the element to be seached
3
Element 3 found at 2 position


Enter the number of elements:
5
Enter the elements
1 2 3 4 5
Enter the element to be seached
6
Element 6 not found
*/
