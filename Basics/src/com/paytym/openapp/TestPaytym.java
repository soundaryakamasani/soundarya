package com.paytym.openapp;

public class TestPaytym {
	public static void main(String[] args){
		System.out.println("Opening Paytym");
	
		Paytym p=new Paytym();
		System.out.println("Trying to login");
		p.login(9944211086L, "Alpha@123");

		
	}

}
