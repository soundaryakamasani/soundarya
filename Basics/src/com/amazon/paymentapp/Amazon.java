package com.amazon.paymentapp;

public class Amazon {
	Product pay(Wallet w){
		System.out.println("Accepting payment using wallet");
		System.out.println("Product id packed");
		Product p=new Product();
		System.out.println("Delivering product to the customer");
		return p;
		
	}
 
	Product pay(CreditCard c){
		System.out.println("Accepting payment using CreditCard");
		System.out.println("Product id packed");
		Product p=new Product();
		System.out.println("Delivering product to the customer");
		return p;
		
}
	Product pay(DebitCard d){
		System.out.println("Accepting payment using DebitCard");
		System.out.println("Product id packed");
		Product p=new Product();
		System.out.println(p);
		System.out.println("Delivering product to the customer");
		return p;
	}
		
}