/*Write a JAVA program that reads 10 numbers from the user, then prints out how many positive numbers
and negative numbers user has entered (consider 0 a positive number).*/
import java.util.*;
public class Numberof_pos_and_neg_numbersentered 
{
    public static void main(String[] args) 
	{int negcount=0,poscount=0, i;
	int arr[]= new int[10];
	Scanner sc= new Scanner(System.in);   
    System.out.print("Enter 10 numbers:\n " );  
	for( i=0; i<10;i++)
	{
	 System.out.print("\t\t\t" );	
     arr[i]= sc.nextInt();
	}
	for(i=0; i<10; i++)
	{
   	if(arr[i]<0)
	{
	negcount++;
	}
	else
	{
	poscount++;
	} 
    }	
	System.out.print("\nTotal positive numbers entered= "+poscount+"\n");
	System.out.print("\nTotal negative numbers entered= "+negcount+"\n");
    }

}



