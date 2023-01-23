package NonStaticMembersDemo;

public class NonStaticMembers {

	int num;

	NonStaticMembers() {
		System.out.println("inside the constructor");
	}

	{
		System.out.println("inside the non static block");
	}

	public static void main(String[] args) {

		System.out.println("inside the main method");
		NonStaticMembers obj = new NonStaticMembers();

		obj.doSomething();
//		new NonStaticMembers();
//		new NonStaticMembers();

	}

	void doSomething() {

		System.out.println("inside something method");
	}

	static {
		System.out.println("inside static block");
	}

	/*
	 * when we create an instance of obj the nonstatic method gets excetued by the
	 * JVM even before the constructor gets called. -- no.of obj created , those
	 * many no .of times non-static & constructor are executed.
	 */
}
