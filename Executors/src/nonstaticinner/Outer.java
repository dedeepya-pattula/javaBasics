package nonstaticinner;

public class Outer {
	
	void f1() {
		System.out.println("outer class non static method");
	}
	
	class Inner{
		void f2() {
			System.out.println("inner class non static method");
		}
	}
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.f1();
		
		Outer.Inner inner = outer.new Inner();
		inner.f2();
		
	

		
	}

}
