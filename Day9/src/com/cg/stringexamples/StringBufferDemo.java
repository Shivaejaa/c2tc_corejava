package com.cg.stringexamples;

public class StringBufferDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("Hello");
		
		//String s2=s1.concat("world");
		System.out.println(s1.concat("world"));
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer("Study");
		System.out.println(sb.append("Night"));
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
	
		
		StringBuffer sb2=new StringBuffer(100);
		System.out.println(sb2.capacity());
		
		
		
		
		
	}

}
