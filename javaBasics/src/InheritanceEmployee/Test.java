package InheritanceEmployee;

public class Test {

	public static void main(String[] args) {

		String[] projects = new String[] {"flight reservation", "check in"};
		//Manager manager = new Manager(1, "jhon","travel", 10000, new String[] {});
		Manager manager = new Manager(1, "jhon","travel", 10000, projects);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();
		
		Developer developer = new Developer(2,"Bharat", "travel", 200000,"Full stack java developer");
		developer.work();
		
		
	}

}
