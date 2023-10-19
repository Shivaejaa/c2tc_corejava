
//within the package

package com.jpm.p1;

public class TestOne {
	
	
	private int i=5;
	private void display()
	{
		System.out.println("in display method");
	}
	public static void main(String agrs[])
	{
		TestOne t1=new TestOne();
		System.out.println(t1.i);
		t1.display();
	}

}
