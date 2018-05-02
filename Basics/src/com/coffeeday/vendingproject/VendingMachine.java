package com.coffeeday.vendingproject;

public class VendingMachine {
ColdWater prepare(Water w){
	System.out.println("Accepting water");
	System.out.println("Generating ColdWater");
	ColdWater w1=new ColdWater();
	System.out.println("Returning cold water");
	return w1;
}
Coffee prepare(CoffeeBean f){
	System.out.println(" Accepting CoffeeBeans");
	System.out.println("Generating Coffee");
	Coffee f1=new Coffee();
	System.out.println("Returning coffee");
	return f1;
	
}
AppleJuice prepare(Apple a){
	System.out.println("Accepting Apple");
	System.out.println("Generating applejuice");
	AppleJuice a1=new AppleJuice();
	System.out.println("Returning applejuice");
	return a1;
	
}

}
