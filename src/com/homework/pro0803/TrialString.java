package com.homework.pro0803;

public class TrialString {
 String a = "Prathamesh";
 String b = "Prathamesh";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrialString t1=new TrialString();
		
System.out.println("total length = " +t1.a.length());
System.out.println(t1.a.isEmpty());
System.out.println(t1.a.charAt(5));
System.out.println(t1.a.codePointAt(5));
System.out.println(t1.a.equals(t1.b));
System.out.println(t1.a.startsWith("pra"));
System.out.println(t1.b.contains("tha"));
System.out.println(t1.b.toUpperCase());
System.out.println(t1.b.toLowerCase());
System.out.println(t1.a.replace('a','b'));
System.out.println(t1.b.replaceAll("[^A-Z]", "-----"));
	}

}

