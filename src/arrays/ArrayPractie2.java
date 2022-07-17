package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayPractie2 {
static Scanner sc = new Scanner(System.in);
static int[] a = new int[101];

	public static void main(String[] args) {
		
		int i, c1=0, c2=0, c3=0;
		
		for(i=0;i<=a.length-1; i++) {
			a[i]= i;
		}
		System.out.println(Arrays.toString(a));
		
		for(i=0;i<=a.length -1;i++) {
			if(a[i]%4==0 && a[i]%7==0)
				c1++;
		}
		
		for(i=0;i<=a.length -1;i++) {
			if(a[i]%4==0)
				c2++;
		}
					
		for(i=0; i<=a.length-1;i++) {
			if(a[i]%7==0)
				c3++;
		}
		System.out.println("\n"+c1+" "+c2+" "+c3);
		
		int[] b = new int[c1];
		int[] c = new int[c2];
		int[] d = new int[c3];
		
		c1=0;c2=0;c3=0;
		for(i=0;i<a.length;i++) {
			if(a[i]%4==0 && a[i]%7==0)
			{
				b[c1] = a[i];
				c1++;
			}
				
		}
		System.out.println("\n"+Arrays.toString(b));
		
		for(i=0;i<=a.length -1;i++) {
			if(a[i]%4==0)
			{
				c[c2] = a[i];
				c2++;
			}
		}
		System.out.println(Arrays.toString(c));
					
		for(i=0; i<=a.length-1;i++) {
			if(a[i]%7==0)
			{
				d[c3] = a[i];
				c3++;
			}
		}
		System.out.println(Arrays.toString(d));
		
	}
}

