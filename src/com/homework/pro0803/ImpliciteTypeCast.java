package com.homework.pro0803;

public class ImpliciteTypeCast {

	public static void main(String[] args) {
		
		String name = "prathamesh";
				byte num =22;
		short a = num;
		int i = a;
		long l = i;
		float f = l;
		double d = f;
	char c = 'j';
	int i1 = c;
		
	System.out.println("name =" +name);
	System.out.println("byte =" +num);
	System.out.println("short =" +a);
	System.out.println("int =" +i);
	System.out.println("long=" + l);
	System.out.println("float =" +f);
	System.out.println("double=" +d);
	System.out.println("char ="+c);
	System.out.println("int i1="+i1);
				
		}

}

