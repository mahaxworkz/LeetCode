import java.util.Scanner;

public class ASCIIConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[] asciiarr=new int[input.length()];
        
        for(int i=0;i<input.length();i++){
            char c= input.charAt(i);
            int value=(int)c;
            asciiarr[i]=value;
            
        }
         for(int i=0;i<asciiarr.length;i++){
             System.out.println("value of"+asciiarr[i]);
            
        }

     }
}