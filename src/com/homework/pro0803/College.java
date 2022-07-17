package com.homework.pro0803;

class Test{
	int m1,m2;

	static {
		System.out.println("Inside static block of test class");
	}
	
	{
		System.out.println("Inside instance block of test class");
	}

	public Test(int m1, int m2) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		System.out.println("test constructor is executing");
	}
	void result () {
		System.out.println("Marks of the subject1 = "+m1);
		System.out.println("Marks of the subject2 ="+m2);
	}
}
public class College extends Test {
int roll, id;
	static {
	System.out.println("Inside the college class static block");
	}
	
	{
		System.out.println("Inside the instance block of College class");
	}
	
	
	public College( int roll, int id) {
		super(12,23);
		this.roll = roll;
		this.id = id;
		System.out.println("In the college constructor is executing");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("......main method is working.....");
		Test T1 = new Test(10, 20);
		System.out.println("std1 marks m1 = "+T1.m1);
		System.out.println("std2 marks m2 = "+T1.m2);
		
		Test T2 = new College(34,50);
		System.out.println("Std2 marks m1 = "+T2.m1);
		System.out.println("Std2 marks m2 = "+T2.m2);
	
		College C1 = new College(30,40);
		System.out.println("std3 marks m1 = "+C1.m1);
		System.out.println("Std3 marks m2  = "+C1.m2);
		System.out.println("Std3 marks roll = "+C1.roll);
		System.out.println("Std3 marks id  = "+C1.id);
	}

}
