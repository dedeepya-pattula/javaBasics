package Immutable;

public class ImmutableDemo {

	public static void main(String[] args) {

		String s1 ="hello";
		String s2 = "world";
		
		System.out.println("Before concat:"+"\ns1:"+s1+ "\ns2:"+s2);
		
		s1 = s1.concat(s2);
		
		System.out.println("after concat:"+"\ns1:"+s1+ "\ns2:"+s2);
		
		
	}

}
