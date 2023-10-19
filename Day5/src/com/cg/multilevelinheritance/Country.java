package com.cg.multilevelinheritance;

public class Country {
	private String countryName;
	private String Capital;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", Capital=" + Capital + "]";
	}
	

}
