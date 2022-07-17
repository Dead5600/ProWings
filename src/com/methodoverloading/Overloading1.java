package com.methodoverloading;
class Loading {}

public class Overloading1 extends Loading{
// when we calling an method passing parameter for single parameter if passing parameter is same then it will go direct call

	// priority of the calling for primitive as Parameter 
		//Direct Call --- Implicit(Widening) --- AutoBoxing --- Parent(Number) --- Object ---- CompileTime Error
	
	// Priority of the Object as Parameter
		//Direct Call --- Parent --- Super Parent --- Object --- CompileTime Error
	
	// Priority of the Wrapper Class Object as a Parameter
		// Direct Call --- Parent (Number) --- Object --- AutoUnboxing --- AutoUnboxing + Implicit (widening) --- CompileTime error  
	
	
	// ------------For primitive as Parameter---------
	static void add(char c) {System.out.println("Inside char method");}
	//static void add(byte a) {System.out.println("Inside the byte method");	}
	//static void add(int a) {System.out.println("Inside the int method");}
	//static void add(long b) {System.out.println("Inside the long method");}
	//static void add(float b) {System.out.println("Inside the float method");}
	//static void add(double c) {System.out.println("Inside the double method");}
	static void add(String c) {System.out.println("Inside the String method");}
	//static void add(Byte c) {System.out.println("Inside the Byte method");}
	static void add(StringBuffer c) {System.out.println("Inside the String Buffer method");}
	static void add(Integer c) {System.out.println("Inside the Integer method");}
	static void add(Long c) {System.out.println("Inside the Long method");}
	static void add(Float c) {System.out.println("Inside the Float method");}
	//static void add(Number c) {System.out.println("Inside the Number method");}
	static void add(Object c) {System.out.println("Inside the Object method");}
	
	// --------For Object as Parameter-----------
	static void add(Overloading1 x) {System.out.println("Inside the Overloding Method");}
	static void add(Loading l) {System.out.println("Inside the loading method");}
	
	// --------For Wrapper class Object as Parameter ---------
	static void sub(Integer c) {System.out.println("Inside the Integer method");}
	static void sub(Long c) {System.out.println("Inside the Long method");}
	static void sub(Float c) {System.out.println("Inside the Float method");}
	//static void sub(Number c) {System.out.println("Inside the Number method");}
	static void sub(Object c) {System.out.println("Inside the Object method");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		add( b);
		add('A');
		Overloading1 O = new Overloading1();
		add(O);
		Integer I = new Integer(10);
		sub(I);
		}

}
