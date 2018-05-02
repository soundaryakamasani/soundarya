package com.bigbazar.apparelexample;

public class Apparel {
	String type;
	String color;
	char size;
	Apparel(String type,String color,char size)
	{
		this.type=type;
		this.color=color;
		this.size=size;
	}
	void showDetails(){
		System.out.println(this.type+" "+this.color+" "+this.size);
	}
	Apparel(String type, char size){
		this.type=type;
		this.size=size;
		this.color="Black";
	}
	
	

}
class TestApparel{
	public static void main(String[] args){
		Apparel a=new Apparel("jean","Blue",'m');
	      a.showDetails();
	      Apparel a2=new Apparel("T shirt","Black",'l');
	      a2.showDetails();
	      Apparel a3=new Apparel("shirt",'s');
	      a3.showDetails();
	      
	      
	}
}
