public class  ImplementLowerBound{
    public static int lowerBound(int []arr, int n, int x) {
        int count=0;
       for(int i=0;i<n;i++){
           if(arr[i]<x) count+=1;
       }
       return count;
    }
}