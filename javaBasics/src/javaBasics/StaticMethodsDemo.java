package javaBasics;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		
		System.out.println("isnide the main");
		StaticMethodsDemo.method1();
		
	}
	
	static void method1() {
		System.out.println("inside method");
	}

	static {
		System.out.println("inside the static block");
		StaticMethodsDemo.method1();
	}
}
