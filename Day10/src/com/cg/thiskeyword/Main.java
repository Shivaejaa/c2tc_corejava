package com.cg.thiskeyword;

class A
{
	int data=10;
	void display()
	{
		show(5);
		System.out.println("In dislay method");
		
	}
	void show(int a)
	{
		System.out.println(a);
		System.out.println("In show method");
	}
}
class B
{
	B()
	{
		
	}
	
}


public class Main {

	public static void main(String[] args) {
		

		A obj=new A();
		obj.display();
		//obj.show();
		
		
	}

}
