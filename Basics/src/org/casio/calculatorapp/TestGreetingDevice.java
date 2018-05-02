package org.casio.calculatorapp;

public class TestGreetingDevice {
	public  static void main(String[] args){
		GreetingDevice g=new GreetingDevice();
		g.greet();//Hello
		g.greet("ricky");//HelloRicky
		g.greet("Steve");//Hello steve
	}

}
