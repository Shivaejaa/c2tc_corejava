package com.cg.stringexamples;

public class StringComparison {

	public static void main(String[] args) {
		//string literal
		String s1="TNSIF";
		String s2="TNSIF";
		
		//using new kerword
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s4==s3);//false
		
		
		System.out.println(s4.equals(s3));//true
		
		System.out.println(s1.compareTo("tnsif"));
		System.out.println(s3.compareToIgnoreCase("tsnsif"));
	
		
	
	}

}
