package com.mi.unlockapp;

public class TestMobilePhone {
	public static void main(String[] args){
		System.out.println("MobilePhone object is present");
		MobilePhone m=new MobilePhone();
		System.out.println("Trying to unlock");
		m.unlock(1234);
	}
}
