package Immutable;

public class StringPoolDemo {

	public static void main(String[] args) {

		User user1 = new User(1,"abc");
		User user2 = new User(2,"bdc");
		
		System.out.println(user1);
		System.out.println(user2);
		
		String s1 = "abc";
		String s2= "abc";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//as long as u use the same content for a particular
		//string it points same memory
	}

}