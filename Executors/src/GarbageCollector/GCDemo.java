package GarbageCollector;

public class GCDemo {
	
	GCDemo(){
		System.out.println(this +"created");
	}

	public static void main(String[] args) {

		new GCDemo();
		new GCDemo();
		
	}
	
	protected void finalize() {
		System.out.println(this +"finlized");
	}

}
