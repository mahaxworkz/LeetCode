package com.xworkz.striver;

import java.util.Arrays;

public class CountFrequency {

	public static void main(String[] args) {
		 int[] arr= { 1,3,7,4,6,2,1,8};

	int[] result=	 countFrequency(8, 9, arr);
	System.out.println(Arrays.toString(result));
	}
	public static int[] countFrequency(int n, int x, int []nums){
        
        int[] countArr=new int[n];
        for(int i=0;i<n;i++){
            int value= nums[i];
            if(value>=1 && value<=x){
                countArr[value-1]++;
            }
        }
        return countArr;
   }
}
