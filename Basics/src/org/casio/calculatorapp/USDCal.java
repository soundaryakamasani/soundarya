package org.casio.calculatorapp;

public class USDCal {
	void convertRupeesToUSD(double rupees){
		double USD=rupees/64.8;
		double comm=USD*0.03;
		double totalValue=USD-comm;
		System.out.println("The total conversion value is"+USD);
		System.out.println("The total comission is"+ comm);
		System.out.println("")
	}

}
