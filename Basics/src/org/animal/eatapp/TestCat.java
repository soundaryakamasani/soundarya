package org.animal.eatapp;

public class TestCat{
	
		public static void main(String[] args){
			Cat c=new Cat();
			Fish fish=new Fish();
			c.eat(fish);
			Cheese ch=new Cheese();
			c.eat(ch);
		}
	}


