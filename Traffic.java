public class  Traffic{
    public static int traffic(int n, int m, int []vehicle) {
         int num=0;
         int r=0;int l=0;
         int len=0;
         while(r<n){
             if(vehicle[r]==0){
                 num++;
             }
             while(num>m){
                 if(vehicle[l]==0){
                     num--;
                 }
                 l++;
             }
             len=Math.max(len, r-l+1);
             r++;
         }
         return len; 
    }
}