package Encapsulation;

public class Test {

	public static void main(String[] args) {

		Customer c = new Customer();
		
		c.setFirstName("deepu");
		c.setLastName("patulla");
		c.setCreditCard("12345");
				
		System.out.println("first name: "+ c.getFirstName());
		System.out.println("last name: "+ c.getLastName());
		System.out.println("credit card: " + c.getCreditCard());
	}

}
