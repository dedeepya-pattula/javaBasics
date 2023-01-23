package Polymorphism;

public class RunTimeBinding {

	public static void main(String[] args) {

		//using abstract class
//		MACBook m1 = new MACBookPro();
//		MACBook m2 = new MACBookAir();
		
		//using interface
		AppleLaptop m1 = new MACBookPro();
		AppleLaptop m2 = new MACBookAir();
		
		m1.start();
		m1.shutdown();
		
		//obj casting
		MACBookPro m3 = (MACBookPro) m1;
		
		m2.start();
		m2.shutdown();
		
		MACBookAir m4 = (MACBookAir) m2;
	}

	//method overriding -- same method with exact signature but different implementation
}
