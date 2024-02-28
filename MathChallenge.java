import java.util.ArrayList;
  import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class MathChallenge{
    public static  List<Integer>  mathChallenge(int num){
        char[] digits=String.valueOf(num).toCharArray();
        ArrayList<String> permut= new ArrayList<>();
        List<Integer> prime= new ArrayList<>();
        generatePermute(digits,0,permut);
       
        for(String per : permut){
            int pernum= Integer.parseInt(per);
            if(pernum != num && isPrime(pernum)){
                prime.add(pernum);
                
            }
        }
        
        
        return prime;
        
    }
      public static void generatePermute(char[] digits, int index,ArrayList<String>permut){
          if(index== digits.length-1){
              permut.add(new String(digits));
              
          }
          else{
              for(int i=index;i<digits.length;i++){
                  if(index!=i && digits[index]=='0'){
                      continue;
                  }
                  swap(digits,index,i);
                  generatePermute(digits,index+1,permut);
                  swap(digits,index,i);
              }
          }
        
    }
      public static  void swap(char[] arr,int i,int j){
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
        
    }
      public static  boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
        
    }
      public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         int num= sc.nextInt();
          List<Integer>  res=mathChallenge(num);
          if(res.isEmpty()){
               System.out.println(0);
          }else{
              System.out.println(res);
          }
         
        
        
        
    }
    
}