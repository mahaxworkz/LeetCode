package com.xworkz.leet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntToRomen {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
		int num= scan.nextInt();
		 String value=IntToRoman(num);
		 System.out.println(value);

	}
	public static String IntToRoman( int num) {
		String[] thousand= {"","M","MM","MMM"};
		String[] hundred= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] ten= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] one= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		return thousand[num/1000]+hundred[(num %1000 )/100]+ten[(num%100) /10]+one[num%10];
		
	}
	
	public static Map<Integer,String> addValue(){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "I");
		map.put(2, "II");
		map.put(3, "III");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(6, "VI");
		map.put(7, "VII");
		map.put(8, "VII");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(1000, "M");
		return map;
		
	}

}
