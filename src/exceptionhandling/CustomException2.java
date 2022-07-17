package exceptionhandling;
import java.util.Scanner;

public class CustomException2 {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please enter your age as per your Aadhar Card");
		int x = sc.nextInt();
			if (x < 18) {
				throw new TooYoung("Please wait for some time to marry");
			}else if(x > 35) 
				{
				throw new TooOld("Sorry but your marriage age is already exceeds");
				}else 
					{
						System.out.println("Thank You for selecting Marathi Matrimony");
						System.out.println("Please Enter your all details .....");
					}
		}
}
class TooYoung extends RuntimeException{
	public TooYoung (String s) {
		super(s);
	}
}
class TooOld extends RuntimeException{
	public TooOld(String s) {
		super(s);
	}
}
