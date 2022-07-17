package com.homework.pro0803;

public class Blocks {
int id, rollNum;
	static {
		System.out.println("Inside the Static Block");
	}

	{
		System.out.println("inside the instance block");
	}
	
	public Blocks(int id, int rollNum) {
		super();
		this.id = id;
		this.rollNum = rollNum;
		System.out.println("inside the Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("........Inside the main method.....");
		Blocks B1 = new Blocks(12,32);
		System.out.println("Id of the student is = "+B1.id);
		System.out.println("ROll number of the student is = "+B1.rollNum);
		
	}

}
