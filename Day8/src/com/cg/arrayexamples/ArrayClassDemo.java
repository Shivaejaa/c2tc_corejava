package com.cg.arrayexamples;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArr[]= {10,20,15,22,35,14,18};
		//System.out.println(intArr[2]);
		System.out.println(Arrays.toString(intArr));
		
		for(int i=0;i<intArr.length;i++)
		{
			System.out.println(intArr[i]);
		}
		
		int i=5;
		System.out.println(i);
		
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		
		int key=22;
		System.out.println("index of 30 is:"+Arrays.binarySearch(intArr, key));
		
		
		int intArr1[]= {10,15,22,45,44,67,78};
		
		if(Arrays.equals(intArr, intArr1))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Both arrays are not equal");
		
		
		//int intArr2[]= {};	
		int intArr2[]=Arrays.copyOf(intArr1,10);		
		System.out.println(Arrays.toString(intArr2));
	}

}
