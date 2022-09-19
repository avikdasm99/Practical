package practical;

abstract class Abcd{
	Abcd(){
		System.out.println("Constructor created");
	}
	abstract void show();
	public void method() {
		System.out.println("non abstract method");
	}	
}

public class Abstraction1 extends Abcd  {
	public void show() {
		System.out.println("Abstraction");
	}
	public static void main(String[] args) {
		Abcd a=new Abstraction1();
		a.show();
		a.method();

	}
}
