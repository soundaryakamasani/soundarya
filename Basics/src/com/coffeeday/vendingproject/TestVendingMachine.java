package com.coffeeday.vendingproject;

public class TestVendingMachine {
	public static void main(String[] args){
		System.out.println("Creating object for vending machine");
		VendingMachine v=new VendingMachine();
		System.out.println("Creating object coolwater");
		Water w=new Water();
		System.out.println("Creating  object for coffee ");
		Coffee f1=new Coffee();
		System.out.println("Creating object for applejuice");
		Apple a1=new Apple();
		ColdWater w1=v.prepare(w);
		AppleJuice a=v.prepare(a1);
		
		
		
		
	}

}
