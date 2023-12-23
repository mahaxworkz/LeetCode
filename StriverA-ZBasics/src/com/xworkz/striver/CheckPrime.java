package com.xworkz.striver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckPrime {

	 
	public static void main(String[] args) {
//		List<Long> value=factorialNumbers(1);
//		for (long n : value) { 
//			System.out.println(n);
//		}
		
	int[] arr=	generateFibonacciNumbers(1);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
	 public static List<Long> factorialNumbers(long n) {
	        List<Long> list= new ArrayList<Long>();
	         
	       long fact=1;
	        if(n==1){
	            return new ArrayList<Long>(0);
	     }
	         for(int i=1;i<=n;i++) {
	        	 fact*=i;
	        	 if(fact<=n) {
	        		 list.add(fact);
	        		 
	        	 }
	        	  
	         }
	          
	        return list;
}
	 public static int[] generateFibonacciNumbers(int n) {
	       int[]  arr=  new int[n];
	       
	        if(n==1) {
	        	return new int[] {0};
	        }
	        else {  
	        	arr[0]=0;
	 	       arr[1]=1;
	       for(int i=2;i<n;i++){
	           arr[i]=arr[i-1]+arr[i-2];
	       }
	        }
	      return arr;
	    }
}
