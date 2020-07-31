package com.neusoft.text1;

public class Text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一个球从100米高度自由落下，每次落地反弹原来高度的一半，求第10次落地时，球共经过多少米？
		double h=100;
		double y=100;
		
	    
		for(int i=1;i<10;i++){
			h=h/2;
			System.out.println(h);
			y=y+h*2;
		
		}
		System.out.println("球共经过"+y+"米");
	}
}
