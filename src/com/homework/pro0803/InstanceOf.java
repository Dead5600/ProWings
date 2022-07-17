package com.homework.pro0803;

class calculation
{ 
	void add() {
	System.out.println(" addition method ");
}}
class substraction extends calculation{
	void sub() {
	
	}	
}

class division extends substraction{
	void div() {
	
	}
}

public class InstanceOf {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String college_name = "Gcg college";
		String studentName ="prathamesh";
	substraction s= new substraction();
		System.out.println( s instanceof calculation);
	division d = new division();
		System.out.println(d instanceof calculation);
		
		
	}

}
