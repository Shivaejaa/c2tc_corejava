package com.cg.multilevelinheritance;

public class MultiLevelInnheritance {
	public static void main(String [] args) {
		City c = new City();
		c.setCity("Banglore");
		c.setArea("Jayanagar");
		
		c.setStateName("Karnataka");
		c.setLanguage("Kannada");
		
		State s =new State();
		s.setStateName("TAMIL NADU");
		s.setLanguage("Tamil");
		
		c.setCity("CHENNAI");
		
		System.out.println(c);
		
		
	}

}
