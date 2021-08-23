/*Write a JAVA program that reads an integer n from the user and print the following pattern.
For n = 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
import java.util.*;
public class Print_pattern 
{
    public static void main(String[] args) 
	{int n,i,j;

	Scanner sc= new Scanner(System.in);   
    System.out.print("Enter an  integer :  " );  
	n= sc.nextInt();
	System.out.print("\n\n\n" );
	for( i=1; i<=n;i++)
	{
		for(j=1; j<=i;j++)
		{
        System.out.print(j+" ");
		}
		System.out.println();
	}
    }
}
//Task3.java