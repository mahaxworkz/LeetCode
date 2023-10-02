class Solution {
    public String addBinary(String a, String b) {
       int x= a.length()-1;
       int y=b.length()-1;
       int carry=0;
       StringBuilder sb= new StringBuilder();
     while(x>=0 || y>=0){
         int sum= carry;
         if(x>=0){
             sum += a.charAt(x) -'0';
         }
         if(y>=0){
             sum += b.charAt(y) -'0';
         }
         if(sum==0 || sum ==1){
             sb.append(sum);
             carry =0;
         }
         else if(sum==2){
             sb.append("0");
             carry=1;
         }
         else{
             sb.append("1");
             carry=1;
         }
         x--;
         y--;
     }
     if(carry == 1){
         sb.append("1");
         

     }
      return sb.reverse().toString();
        
    }
}