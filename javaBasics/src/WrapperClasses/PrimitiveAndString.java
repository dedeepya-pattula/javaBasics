package WrapperClasses;

public class PrimitiveAndString {

	public static void main(String[] args) {

		byte x = 100;

		// primitive to string
		String s = Byte.toString(x);

		//string to primitive
		byte y = Byte.parseByte(s);
	}

}
