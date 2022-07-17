package com.homework.pro0803;

public class standard {
static int division() {
	int a,b, c;
	a= 10;
	b=5;
	c=a/b;
	return c;
	
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("method start here.....");
		System.out.println(division());
		standard s= new standard();
		int x= s.division();
		System.out.println("result="+ x);
		System.out.println(s.division());
		
	}

}
