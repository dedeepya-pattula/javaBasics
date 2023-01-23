package ExceptionalHandling;

import java.util.Iterator;

public class ArrayIndexOOB {

	public static void main(String[] args) {

		int arr[] = {10,20,30};
		try {
		System.out.println("enter the elements");
		for (int i = 0; i <= arr.length;i++) {
			System.out.println(arr[i]);				
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index beyond array length");
		}
	}
	
	void method1() {
		System.out.println("method1");
	}

}
