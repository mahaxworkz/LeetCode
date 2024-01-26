class KthMissingPosNumber {
    public int findKthPositive(int[] arr, int k) {
        int n= arr.length;
        int high=n-1;int low=0;
        while(high>= low){
            int mid=(high+low)/2;
            int miss=arr[mid]-(mid+1);
            if(miss<k){
                low= mid+1;

            }else{
                high= mid-1;
            }
        }
        return k+high+1;
    }
}