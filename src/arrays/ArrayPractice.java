package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayPractice {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y,i;
		System.out.println("plese enter the value you want create an array");
		y = sc.nextInt();
		int[] x = new int[y];
		System.out.println("enter the index value");
	
		for (i=0; i<=x.length -1;i++) {
			x[i] = sc.nextInt();
		}System.out.println("The given arrays is ----> " +Arrays.toString(x));
		
		for(i=x.length-1; i>=0;i-- ) {
			if(i%2==0) {
				System.out.print("	"+x[i]);
			}
		}
	}

}
