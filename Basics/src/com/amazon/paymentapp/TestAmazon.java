package com.amazon.paymentapp;

public class TestAmazon {
	public static void main(String[] args){
		System.out.println("openening the amazon app");
		Amazon a=new Amazon();
		System.out.println("We have debit Card");
		DebitCard d=new DebitCard();
		System.out.println("paying using Debit card");
	Product product=a.pay(d);
	System.out.println(product);
	System.out.println("Recieved the product");
	}

}
