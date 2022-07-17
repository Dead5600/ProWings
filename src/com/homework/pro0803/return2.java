package com.homework.pro0803;

public class return2 {
	static int sub() {
		int a, b ,c;
		a=10;
		b=8;
		c= a-b;
		return c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.out.println(sub());*/
		return2 x= new return2();
		int y= x.sub();
		System.out.println("result="+ y);
		System.out.println(x.sub());
		System.out.println(return2.sub());
		
		
		
		
	}

}
