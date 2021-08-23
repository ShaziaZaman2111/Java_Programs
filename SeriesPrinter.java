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
