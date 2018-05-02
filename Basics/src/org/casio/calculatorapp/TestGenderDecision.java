package org.casio.calculatorapp;

public class TestGenderDecision {
	public static void main(String[] args){
		GenderDecision g1=new   GenderDecision();
		String result=g1.gender(1);
		System.out.println(result);
		GenderDecision g2=new GenderDecision();
		String res=g2.gender(2);
		System.out.println(res);
		GenderDecision g3=new GenderDecision();
		String re=g3.gender(3);
		System.out.println(re);
		
		
	}

}
