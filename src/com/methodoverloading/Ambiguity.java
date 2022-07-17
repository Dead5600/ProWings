package com.methodoverloading;

public class Ambiguity {
	
	//Null Rule for single parameter------Passing through Wrapper class 
	// there is ambiguity error while in passing the null value through add method. When we pass null value through add method at 
	// first it confuse to go either in Integer / Float/ Double. After we comment two of these three then the ambiguity problem will
	// be solved because it goes in nearest child class and follows hierarchy and goes through :--
	// child --- parent ---- super parent--- Object---- Compile time error
	
	static void add(byte a) {System.out.println("Inside the byte method");}
	static void add(int a) {System.out.println("Inside the int method");}
	static void add(long b) {System.out.println("Inside the long method");}
	static void add(float b) {System.out.println("Inside the float method");}
	static void add(double c) {System.out.println("Inside the double method");}
	static void add(Integer c) {System.out.println("Inside the Integer method");}
	//static void add(Long c) {System.out.println("Inside the Long method");}
	//static void add(Float c) {System.out.println("Inside the Float method");}
	static void add(Number c) {System.out.println("Inside the Number method");}
	static void add(Object c) {System.out.println("Inside the Object method");}

	
	
	//***** Null rule for the String Class
	//in the following Programme when we pass null value through sub method then it confuse either it goes in String / Byte/
	//StringBuffer after commenting 2 of these it either goes in remaining method and follows the hierarchy 
	//Priority ------ String/StringBuffer/Byte----Parent class------Object------Compile error
	
	
	static void sub(String c) {System.out.println("Inside the String method");}
	//static void sub(Byte c) {System.out.println("Inside the Byte method");}
	//static void sub(StringBuffer c) {System.out.println("Inside the String Buffer method");}
	//static void sub(Number c) {System.out.println("Inside the Number method");}
	static void sub(Object c) {System.out.println("Inside the Object method");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add (null);
		sub(null);
	}
}





