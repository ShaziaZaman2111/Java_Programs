
public class SmartPhone {
int modelNum;
int ram;
int displaySizeInInches;

SmartPhone(){
int modelNum;
int ram;
int displaySizeInInches;

}
SmartPhone(int modelNum, int ram, int displaySizeInInches){
this.modelNum=modelNum;
this.ram=ram;
this.displaySizeInInches=displaySizeInInches;

}

void printDetails(){
	System.out.println("\nmodel no= "+modelNum+"\nram= "+ram+ 
	"\nDisplay Size In Inches= "+ displaySizeInInches);
}
public static void main(String[] args){
    SmartPhone set1=new SmartPhone();
    set1.modelNum=1;
    set1.ram=5;
    set1.displaySizeInInches=7;
    set1.printDetails();
    SmartPhone set2=new SmartPhone(2,4,6);
    set2.printDetails();
    SmartPhone set3=new SmartPhone(3,6,7);
    set3.printDetails();
    }
}
