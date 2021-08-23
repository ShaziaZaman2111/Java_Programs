/*
Create a class SeriesPrinter. 
 Add some overloaded methods as follows:
o printSeries(int n): prints all the integers up to n from 0.
 Example: printSeries(5) -> 0 1 2 3 4 5
o printSeries(int startIndex, int endIndex): prints all integers from startIndex to endIndex.
 Example: printSeries(5, 10) -> 5 6 7 8 9 10
o printSeries(int startIndex, int endIndex, int interval): prints all the integers form startIndext
with a given interval.
 Example: printSeries(5, 15, 3) -> 5 8 11 14
 include a main method. In the main method test all the overloaded methods of SeriesPrinter
*/
public class SeriesPrinter {
    	int i, n, startIndex, endIndex, interval;
	SeriesPrinter(){
		int i, n, startIndex, endIndex, interval;
	}
	
	
	int printSeries(int n){
		this.n=n;
		System.out.println("\nStaring from 0 upto "+n+ " : ");
		for(int i=0; i<=n; i++){
			System.out.print(" "+i);
		}
		return i;
	}
	int printSeries(int startIndex, int endIndex){
		System.out.println("\nStaring from "+startIndex+ " to "+endIndex+" : ");
		for(int i=startIndex; i<=endIndex; i++){
			System.out.print(" "+i);
		}
		return i;
	}
	int printSeries(int startIndex, int endIndex, int interval){
		System.out.println("\nStaring from "+startIndex+ " to "+endIndex+"with interval of "+interval+" : ");
		for(int i=startIndex; i<=endIndex; i+=interval){
			System.out.print(" "+i);
		}
		return i;
	}
    public static void main(String[] args){
    SeriesPrinter typo=new SeriesPrinter();
    typo.printSeries(5);
    typo.printSeries(5,10);
    typo.printSeries(5,15,3);
    }
}
