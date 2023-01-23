package AccessModifiers;

public class A {

	private int a =10;
	int b=20;
	protected int c = 30;
	public int d=40;
	public static void main(String[] args) {
		
		A aObj = new A();
		System.out.println(aObj.a);
		System.out.println(aObj.b);

		System.out.println(aObj.c);

		System.out.println(aObj.d);


	}

}
