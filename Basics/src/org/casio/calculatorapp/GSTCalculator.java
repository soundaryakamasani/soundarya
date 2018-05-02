package org.casio.calculatorapp;

public class GSTCalculator {
	void calculateGST(double productPrice){
		double gst=productPrice*0.18;
		double totalCost=productPrice+gst;
		System.out.println("The Base Priceof product is"+productPrice);
		System.out.println("GST of the product is"+ gst);
		System.out.println("the total cost of the product is"+totalCost);
		
	}
}
