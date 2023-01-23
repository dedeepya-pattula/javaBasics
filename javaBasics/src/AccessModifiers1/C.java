package AccessModifiers1;

import AccessModifiers.A;

public class C extends A{

	public static void main(String[] args) {
		A aobj = new A();
		System.out.println(aobj.d);
		
		C cobj= new C();
		System.out.println(cobj.c);

	}

}
