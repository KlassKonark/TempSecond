package com.scp.usingComparable;

public class Manufacture {
	
	private int yom;
	private String make;
	
	
	
	public int getYom(){
		return this.yom;
	}
	
	public void setYom(int year){
		this.yom=year;
	}

	public String getMake(){
		return this.make;
	}
	
	public void setMake(String brand){
		this.make = brand;
	}

    public String toString(){
    	return "Manufacture[yom ="+ yom +", make = "+ make +"]";
    }

}
