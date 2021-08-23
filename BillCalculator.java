/*
Suppose that, an Electricity company charges its customers according to the different usage categories. In 
In other words, the charge rate varies with the unit of usage. The basic charge is calculated with the 
following rates:
Unit Charge/unit
upto 199 @1.20
200 and above but less than 400 @1.50
400 and above but less than 600 @1.80
600 and above @2.00
Additionally, if the bill exceeds tk. 400 then a surcharge of 15% will be charged. And finally, the minimum bill should be at least tk. 100/-, that is, if there is no usage or the bill is less than 100, the customer has to pay the minimum bill 100tk.
Now, we will create a JAVA class to calculate the bill. Do the following tasks:
 create a class BillCalculator 
 add a method calculateBasicBill(double unit) that returns the basic bill according to the chart 
above
 add another method calculateSurcharge(double basicBill), that returns the amount of surcharge 
the customer has to pay.
 Add another method getTotalBill(double unit), that first calls the calculateBasicBill() method to 
get the basic bill and then send it to the calculateSurcharge() method to get the amount of 
surcharge. Finally, it will calculate the total bill and return it.
 Inside the main, create an object of BillCalculator and print the bills for 25, 250, and 812 units of 
usage
*/
	public class BillCalculator{
	double basicBill;
	double unit;
	double totalBill;
	double surcharge;

	BillCalculator(double x){
	unit=x;
	double basicBill;
	double unit;
	double totalBill;
	double surcharge;
    }
	double calculateBasicBill(double unit){
		if(unit<=199){
			basicBill= unit*1.20;
			return basicBill;			
		}
		else if(unit>=200 && unit<400){
			basicBill=unit*1.50;
			return basicBill;
		}
		else if(unit>=400 && unit<600){
		     basicBill= unit*1.80;
			return basicBill;
		}
		else{
			 basicBill= unit*2.00;
			return basicBill;
		}
		
	}
	double calculateSurcharge(double basicBill){
		if(basicBill>400){
			 surcharge=(15*basicBill)/100;
		}
		else{
			surcharge=0;
		}
			System.out.println("\nYour Surcharge amount on "+basicBill+ " is : "+surcharge);
			return surcharge;
		
	
	}
	double getTotalBill(double unit){
		double a=calculateBasicBill(unit);
        double b=calculateSurcharge(a);
		
		if(a+b<100){
			System.out.println("Minimum 100tk has to be paid since your total bill is "+basicBill+" which is less than 100!");
			}
		else{
			System.out.println("\nYour Total bill is : ");
		return a+b;
		}
		
		return a+b;
	    }
        //main function
	public static void main(String args[]){
		BillCalculator bill1, bill2, bill3;
		bill1= new BillCalculator(25);
		bill2= new BillCalculator(250);
		bill3= new BillCalculator(812);
		

		System.out.println(bill1.getTotalBill(25));
		System.out.println(bill2.getTotalBill(250));
		System.out.println(bill3.getTotalBill(812));
	}
}
