package eventManaagement;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.id = 123l;
		organizer.name="apple inc";
		System.out.println(organizer);
		System.out.println(organizer.name);
		
		Event event = new Event(345l,"iphone 10","grand launch");
		
		System.out.println(event.description);
				
	}

}
