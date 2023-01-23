
public class Test {

	public static void main(String[] args) {

		Product product = new Product(1,"iphone");
		System.out.println(product); //prints obj reference not the values
		
		String s ="123"	;
		
		Integer i = new Integer(345);
		
		System.out.println(s);
		System.out.println(i);
		
	}

}
