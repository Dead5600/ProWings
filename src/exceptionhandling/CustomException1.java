package exceptionhandling;
import java.util.Scanner;

public class CustomException1 {
static	Scanner  sc = new Scanner(System.in);

 /*we used the 'throw'  keyword when there is user defined exception is required.
 After throw keyword the flow control is terminated after the execution.
syntax while using throw keyword :- throw new Object(String s);*/

public static void main(String[] args) {
		
	System.out.println("please enter your amount to withdraw");
		int y;
		y = sc.nextInt();
	
			if(y<500)
			{
				throw new MinimumAccount_Balance("Please enter amount more than 500");
			}else if(y>10000) {
				throw new MaximumAccount_Balance("Please enter amount less than 10000");
			}else {
				System.out.println("Welcome to our Bank");
				System.out.println("Withdraw your amount");
			}
	}
}
class MinimumAccount_Balance extends RuntimeException{
 public MinimumAccount_Balance(String S) {
	 super(S);
 }
}

class MaximumAccount_Balance extends RuntimeException {
	public MaximumAccount_Balance(String S) {
		super(S);
	}
}