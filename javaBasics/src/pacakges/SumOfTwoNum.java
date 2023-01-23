package pacakges;
import java.util.Scanner;

public class SumOfTwoNum {

	public static void main(String[] args) {

		System.out.println("enter the numebrs:");
		Scanner sc=  new Scanner(System.in);   	//for reading inputs from console  at the run time
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());
		int result= num1 + num2;
		System.out.println("sum is "+result);
		
	}

}
