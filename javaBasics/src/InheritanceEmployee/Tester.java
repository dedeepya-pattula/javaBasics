package InheritanceEmployee;

public class Tester extends Employee{

	String[] tools;
	
	public Tester(int id, String name, String dept, double salary, String[] tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}
	
	@Override
	public void work() {
		super.work();
		System.out.println("manager is managing");
		for(int i =0; i<tools.length; i++) {
			System.out.println(tools[i]);
		}

}
}