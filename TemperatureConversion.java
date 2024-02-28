import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        double temp;
         System.out.println("Enter temperature");
            temp= scanner.nextDouble();
        if(choice==1){
            //(°C × 9/5) + 32 = °F
            
            double value=((temp*9)/5)+32;
             System.out.println("  Celsius to Fahrenheit value is"+value);

            
        }else if(choice==2){
              //(°F − 32) x 5/9
            double value1=((temp-32)*5)/9;
             System.out.println("   Fahrenheit to Celsius  value is"+value1);
            
        }else{
             System.out.println("Choose between 1 to 2");
        }

     }
}