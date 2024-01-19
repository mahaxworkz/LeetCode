public class FindRootOfN {
    public static int NthRoot(int n, int m) {
         int low=1;int high=m;
         while(low<=high){
             int mid= (high+low)/2;
              int midn= MidN(n, m, mid);

             if(midn==1) return mid;
             else if(midn==0){
                 low= mid+1;

             }
             else{
                 high= mid-1;
             }
         }
         return -1;
    }
    public static int MidN(int n, int m,int mid) {

         long ans=1;
         for(int i=1;i<=n;i++){
             ans=ans *mid;
             if(ans> m)return 2;

         }
         if(ans==m)return 1;
         return 0;
    }

}