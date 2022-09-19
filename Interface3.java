package practical;


interface Asd{
	void run();
	default void show() {
		System.out.println("default method");
			}
	static void print() {
		System.out.println("static method");
	    }
	}

public class Interface3  implements Asd{
	public void run() {
		System.out.println("abstract method");
	}
	public static void main(String[] args) {
		Asd a=new Interface3 ();
		a.run();
		Asd.print();
		a.show();
		
	}

}
