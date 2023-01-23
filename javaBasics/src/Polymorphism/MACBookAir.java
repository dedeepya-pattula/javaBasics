package Polymorphism;

public class MACBookAir extends MACBook {
	
	@Override
	public void start() {
		System.out.println("inside macbookair start");
	}

	@Override
	public void shutdown() {
		System.out.println("inside macbooksir shutdown");
	}
}
