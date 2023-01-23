package NonStaticMembersDemo;

public class ORStaticBlock {
	
	static ORStaticBlock obj;
	
	static {
		System.out.println(ORStaticBlock.obj);
		ORStaticBlock.obj = new ORStaticBlock();
		
	}
	public static void main(String[] args) {
		System.out.println(ORStaticBlock.obj);
	
	/*static {
		ORStaticBlock obj = new ORStaticBlock();
		System.out.println(obj);
	}

	public static void main(String[] args) {
		System.out.println("hi");

	}*/

}
}
