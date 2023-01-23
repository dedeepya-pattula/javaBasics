package Polymorphism;

public class MACBookPro extends MACBook {
	
	@Override
	public void start() {
		System.out.println("inside macbookpro start");
	}

	@Override
	public void shutdown() {
		System.out.println("inside macbookpro shutdown");
	}
}
