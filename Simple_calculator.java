/*Write a JAVA program that asks the user to enter two numerical values 
(integers) and then select an operation (addition, subtraction,
 multiplication and division). Finally, prints the result based on
 operation selected. Use switch-case statement.
Use the following input/output format (text shown in boldface is 
supposed to be user input):
Enter first number: 4
Enter second number: 2
1. Addition (+).
2. Subtraction (-).
3. Multiplication (*).
4. Division (/).
Enter operation number: 3
The result is 8*/
import java.util.*;
public class Simple_calculator 
{
    public static void main(String[] args) 
	{int a,b, o;

	Scanner sc= new Scanner(System.in);   
    System.out.println("\nEnter 1st number :  " );  
	a= sc.nextInt();
 
	System.out.println("\nEnter 2nd number :  " );  
	b= sc.nextInt();

	System.out.println("\n\n1. Addition (+).\n2. Subtraction (-).\n3. Multiplication (*).\n4. Division (/).\n\nEnter operation number:  " );  
    o= sc.nextInt();
	switch(o)
	{
	case 1:
	int sum=a+b;
	System.out.println("\n\nThe Sum is: "+sum);
	break;
	case 2:
	int difference=a-b;
	System.out.println("\n\nThe Difference is: "+difference);
	break;
	case 3:
	int product=a*b;
		System.out.println("\n\nThe Product is: \n\n"+product);
	break;
	case 4:
	int quotient=a/b;
		System.out.println("\n\nThe Quotient is: \n\n"+quotient);
	break;
	default:
	break;
	}

    }
}

//Task4.java