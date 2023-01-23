package localInner;

public class Outer {
	
	void f1() {
		System.out.println("Inside the outer f1");
		class localInner{
			void f2() {
				System.out.println("inside localinner f2");
			}
		}
		localInner inner = new localInner();
		inner.f2();
		
	}

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.f1();
		
	}

}
