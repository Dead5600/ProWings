package com.homework.pro0803;

public class ExplicitTypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String name = "prathamesh";
  int i1= 223;
  short s = (short)i1;
  byte roll_num = (byte)i1;
   
double balance = 25000;
float f = (float)balance;
long l =(long)f;
int i = (int)f;
short a = (short)f;
byte b= (byte)f;

System.out.println("person =" +name);
System.out.println("int i1 =" +i1);
System.out.println("short =" +s);
System.out.println("byte=" +roll_num);
System.out.println("balance="+balance);
System.out.println("float="+f);
System.out.println("long="+l);
System.out.println("int="+i);
System.out.println("short=" +a);
System.out.println("byte ="+b);
  
	}

}
