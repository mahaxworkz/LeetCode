import java.util.* ;
import java.io.*; 
public class CountSubArrays {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int sum=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i;j<n;j++){
                cnt+=arr[j];
                if(cnt==s)
                sum++;
            }
        }
        return sum;  
           
    }
}