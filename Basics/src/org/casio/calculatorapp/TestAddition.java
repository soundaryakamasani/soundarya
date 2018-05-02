package org.casio.calculatorapp;

public class TestAddition {
	public static void main(String[] args){
		Addition a1=new Addition();
		int result=a1.add(4,10);
		System.out.println(result);
		Addition a2=new Addition();
		int res=a2.add(10,20,30);
		System.out.println(res);
		Addition a3=new Addition();
		System.out.println(a3.add(1, 2,3,4));
		
		
	}

}

















