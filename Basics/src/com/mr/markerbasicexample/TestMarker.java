package com.mr.markerbasicexample;

public class TestMarker {
	public static void main(String[] args)
	{
		Marker m1=new Marker();
		System.out.println(m1);
		m1.showDetails();
		m1.color="Black";//after object creation
		m1.showDetails();
		Marker m2=new Marker();
		System.out.println(m2);
		m2.showDetails();
		m2.color="red";
		m2.showDetails();
		
		
	}
}
