package com.methodoverloading;

public class AmbiguityForDoubleParameter {
	//static void add(int a, int b) {System.out.println("int int parameter");}
	//static void add(int a, long b) {System.out.println("int long parameter");}
	//static void add(int a, float b) {System.out.println("int float parameter");}
	//static void add(int a, double b) {System.out.println("int double parameter");}
	static void add(float a, int b) {System.out.println("float int parameter");}
	static void add(float a, float b) {System.out.println("float float parameter");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		
	}

}
