package ExceptionalHandling;

public class Test {
	
	static ArrayIndexOOB a;

	public static void main(String[] args) {

		Test.a.method1();
	}

	//NullPointerException - because we didn't create instance of obj
}
