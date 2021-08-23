/*Write a JAVA program that first reads an integer n from the user, then reads another n integers and stores
them into an array. Finally, it will ask for another integer p from the user and find the occurrences of p in the
array. Use enhanced for-loop to search through the array.
Use the following input/output format (text shown in boldface is supposed to be user input):
Enter the number of elements: 6
Enter 6 integers: 3 8 2 3 1 0
Enter the number to search: 3
3 occurred 2 times in the array.*/
import java.util.*;
public class Search_number_and_find_occurence 
{
    public static void main(String[] args) 
	{int n, i,j, x,  count=0;

    Scanner sc= new Scanner(System.in);   
    System.out.println("Enter the number of elements :  " );  
	n= sc.nextInt();

    int arr[]= new int[n];
    System.out.print("Enter "+n+" integers:  " );  
	for( i=0; i<n;i++)
	{	
     arr[i]= sc.nextInt();
	}
	System.out.println("\nEnter the number to search :  " ); 
    x= sc.nextInt();
	for(i=0; i<n; i++)
	{
    if(arr[i]==x)
	{
		count++;	
	}
		
	}System.out.println(x+" occured "+ count +" times in the array." ); 	
	}
}
	

//Task5.java