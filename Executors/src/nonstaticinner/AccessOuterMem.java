package nonstaticinner;

public class AccessOuterMem {
	
	private static int x =50;
	private int y;
	
	AccessOuterMem(int y){
		this.y=y;
	}
	
	void f1() {
		System.out.println("outer class non static method");
	}
	
	class Inner{
		private int y;
		
		Inner(int y){
			this.y=y;
		}
		private void f2() {
			System.out.println("outer class x"+AccessOuterMem.x);
			System.out.println("outer class y"+AccessOuterMem.this.y);
			System.out.println("inner class y"+this.y);
		}
	}
	public static void main(String[] args) {
		
		AccessOuterMem outer = new AccessOuterMem(80);
		outer.f1();
		
		AccessOuterMem.Inner inner = outer.new Inner(30);
		inner.f2();
		System.out.println(inner.y);
		
	

		
	}

}
