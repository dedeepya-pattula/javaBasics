package NonStaticMembersDemo;

public class ObjectReferenceDemo {
	
	int x;
	
	ObjectReferenceDemo(){
		
	}

	public static void main(String[] args) {
		ObjectReferenceDemo or = new ObjectReferenceDemo();
		System.out.println(or.x);

	}

}
