import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values of a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();
        
        double delta= b*b - 4 * a * c;
        if(delta>0){
            double r1= (-b + Math.sqrt(delta))/(2*a);
            double r2=(-b -Math.sqrt(delta))/(2*a);
            System.out.print("  value of r1: "+r1);
            System.out.print("  value of r2: " +r2);
            
        }else if(delta==0){
            double r= -b/2*a;
             System.out.print("  value of root: "+r);
            
        }else{
            double real= -b/2*a;
            double ip=Math.sqrt(-delta)/2*a;
             System.out.print(" value of r: "+real+"+"+ip+"i");
              System.out.print(" value of r: "+real+"-"+ip+"i");
        }

        
     }
}