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