package com.bluestar.acmanufacture;

public class TestAirConditioner {
	public static void main(String[] args){
		AirConditioner ac=new AirConditioner();
		System.out.println("Creating object for ac");
		Water w=new Water();
		System.out.println("Creating object for water");
		Air a=ac.blow(w);
		System.out.println("Room get chilled");
	}

}
