package InnerClasses;

public class OuterStatic {
	
	static void f1() {
		System.out.println("outer static method");
	}
	
	static class Inner{
		
		static void f2() {
			System.out.println("inner static method");
		}
		
		void f3() {
			System.out.println("non static method inside the inner class");
		}
	}

	public static void main(String[] args) {
		
		OuterStatic.f1();
		OuterStatic.Inner.f2();
		
		OuterStatic.Inner inner = new OuterStatic.Inner();
		
		inner.f3();

		
	}

}
