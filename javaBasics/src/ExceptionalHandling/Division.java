package ExceptionalHandling;

import java.util.Scanner;

public class Division {
	
	public static void main(String[] args) {
		
		//java.lang.ArithmeticException:
		
		int a,b,c;
		
		try {
		System.out.println("enter the numbers ");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		c=a/b;
		System.out.println("restult"+c);
		}catch(ArithmeticException e) {
			System.out.println("don't enter zero");
		}
		System.out.println("more code");
	}

}
