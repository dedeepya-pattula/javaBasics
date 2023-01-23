package inheritance.superkeyword;

public class Child extends Parent {
	
	int c,d;
	Child(int a, int b,int c,int d) {
		super(a, b);
		this.c =c;
		this.d=d;
	}
	
	void display() {
		System.out.println("parent a"+super.a);
		System.out.println("parent b"+super.b);
		System.out.println("child c"+this.c);
		System.out.println("child c"+this.d);
	}

	void f1() {
		super.f1();
		System.out.println("inside child f1()");;
	}

}
