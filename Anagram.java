import java.util.Scanner;

public class  Anagram{

    static boolean isAnagram(String a, String b) {
        String A= a.toLowerCase() ;
        String B= b.toLowerCase();
        if(A.length() == B.length()){
            char[] st1= A.toCharArray();
            char[] st2= B.toCharArray();
           java.util.Arrays.sort(st1);
            java.util.Arrays.sort(st2);
            boolean result= java.util.Arrays.equals(st1, st2);
             if(result) return true;
            
        }
        return  false;
    }
public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}