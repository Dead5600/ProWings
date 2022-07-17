package com.homework.pro0803;

public class Return {
 static int multiply() {
	int a,b,c;
	 a=6;
	 b=5;
	c= a*b;
	return c;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method........");
/*System.out.println( multiply());*/

Return R= new Return();
/*System.out.println(R.multiply());*/
int x= R.multiply();
/*System.out.println("result="+ x);*/
System.out.println(Return.multiply());




	}

}
