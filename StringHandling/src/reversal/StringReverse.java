package reversal;

public class StringReverse {
	
	public String first(String actual) {
		String reversed = "";
		for(int i = actual.length();i>0;i--) {
			reversed += actual.charAt(i-1);
		}
		return reversed;
		
	}

	public static void main(String[] args) {

		String str = "deepu";
		StringReverse sr =   new StringReverse();
		System.out.println(sr.first(str));
		
	}

}
