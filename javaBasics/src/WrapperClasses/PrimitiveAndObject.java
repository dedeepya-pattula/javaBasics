package WrapperClasses;

public class PrimitiveAndObject {

	public static void main(String[] args) {

		int x = 100;
		//primitive to obj
		Integer y = Integer.valueOf(x);
		//obj to primitive
		int z = y.intValue();

	}

}
