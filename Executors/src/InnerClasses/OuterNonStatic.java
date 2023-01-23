package InnerClasses;

public class OuterNonStatic {
	
	static void f1() {
		System.out.println("outer static method");
	}
	
	static class Inner{
		
		static void f2() {
			System.out.println("inner static method");
		}
	}

	public static void main(String[] args) {
		
		OuterNonStatic.f1();
		OuterNonStatic.Inner.f2();

		
	}

}
