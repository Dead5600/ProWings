package com.homework.pro0803;

public class Construct {
static String school="gpg college";
static int school_id=32;
int roll_num;
int marks;
char grade;

	public Construct(int roll_num, int marks, char grade) {
	super();
	this.roll_num = roll_num;
	this.marks = marks;
	this.grade = grade;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Construct c1= new Construct(12, 66, 'D'); 
Construct c2= new Construct(22, 76, 'C');
Construct c3= new Construct(23, 98, 'A');
Construct c4= new Construct(25, 88, 'B');


System.out.println("\n\tschool name= "+ school+"\n\t School id ="+school_id);
System.out.println("\n\t roll num ="+ c1.roll_num+"\n\t student marks= "+c1.marks+"\n\t grade= "+c1.grade);
System.out.println("\n\t roll num="+ c2.roll_num+"\n\t student marks= "+c2.marks+"\n\t grade= "+c2.grade);
System.out.println("\n\t roll num="+ c3.roll_num+"\n\t student marks ="+c3.marks+"\n\t grade= "+c3.grade);
System.out.println("\n\t roll num="+ c4.roll_num+"\n\t student marks= "+c4.marks+"\n\t grade ="+c4.grade);

	}

}
