package com.homework.pro0803;

public class Instance_variables {
	
	static String SSC_board = "pune district board";
	static String college_name = "shahu kumar bhavan";
	 
	String student_name;
	int roll_num;
	float percentage;
	char grade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instance_variables s1 = new Instance_variables();
s1.student_name  = "shubham";
s1.roll_num = 12;
s1.percentage =92.54f;
s1.grade = 'A';
Instance_variables s2 = new Instance_variables();
s2.student_name = "kiran";
s2.roll_num= 13;
s2.percentage= 89.38f;
s2.grade ='B';

System.out.println("SSc board="+ SSC_board);
System.out.println("College name="+ college_name);
System.out.println("name="+s1.student_name);
System.out.println("rool num="+s1.roll_num);
System.out.println("percentage="+s1.percentage+"%");
System.out.println("grade="+s1.grade);
System.out.println("***************************");
System.out.println("SSC board="+ SSC_board);
System.out.println("College name="+college_name);
System.out.println("name="+s2.student_name);
System.out.println("roll num="+ s2.roll_num);
System.out.println("percentage="+s2.percentage+"%");
System.out.println("grade="+ s2.grade);
	}

}