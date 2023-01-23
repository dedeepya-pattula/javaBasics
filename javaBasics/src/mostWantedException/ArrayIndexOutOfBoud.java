package mostWantedException;

public class ArrayIndexOutOfBoud {

	public static void main(String[] args) {

		int a[] = new int[10];
		System.out.println(a[0]);
	//	System.out.println(a[20]);
		
		System.out.println(a[a.length-1]);
	}

}
