//Write a simple JAVA program that calculates the sum of all numbers between 1 to 100.
public class Sum_1to100 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 100; ++i)
        {
            sum += i;
        }

        System.out.println("Sum of numbers 1 to 100 = " + sum);
    }
}
