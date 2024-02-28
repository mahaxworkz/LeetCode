import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
         Random random= new Random();
         int die1= random.nextInt(6)+1;
           int die2= random.nextInt(6)+1;
           int sum= die1+die2;

        // Print the result
        System.out.println("Result of rolling two dice:");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Sum of two dice: " + sum);
    }
}