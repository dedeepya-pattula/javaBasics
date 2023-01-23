package stringBuffer;

public class SBDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("Initial capacity:"+ sb.capacity());
		
		sb.append("all the power is with in you");
		sb.append("you can do anything and everything");
		
		System.out.println(sb);
		
		System.out.println("current capacity:"+sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("abced");
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.insert(3, "xyz"));
		System.out.println(sb1.delete(3, 6));
				
	}

}
