import java.io.*;
import java.util.*;

public class  StringTokens{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
         String[] st= s.split("[^a-zA-Z]");
         int num=0;
         
         for(int i=0;i<st.length;++i){
             if(st[i].length()>0)
             num++;
         }
         System.out.println(num);
         for(int i=0;i<st.length;++i){
             if(st[i].length()>0){
                 System.out.println(st[i]);
             }
         }
         
        scan.close();
    }
}
