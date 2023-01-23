package Polymorphism;

public class CompileTimeBinding {
	
	void add(int a, int b) {
		int result = a+b;
		System.out.println("result is "+result);
	}
	
	void add(float a, float b) {
		float result = a+b;
		System.out.println(result);
	}
	
	void add(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("result"+result);
	}

	public static void main(String[] args) {
		CompileTimeBinding obj= new CompileTimeBinding();
		obj.add(10,20);
		obj.add(19f,30f);
		obj.add(2,3,4);
		

		
	}

	//method overloading -- multiple  methods with same name but different  signature 
}
