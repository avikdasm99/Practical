package practical;


interface Bv{
	void show();
	void print();
	void display();
}
abstract class Amal implements Bv{
	public void show() {
		System.out.println("print show method");
	}
}
class Amar extends Amal{
	public void print() {
		System.out.println("PRINT print method");
	}
	public void display() {
		System.out.println("print display method");
	}
}

public class Interface_abbstricton {

	public static void main(String[] args) {
		Bv obj1=new Amar();
		obj1.display();
		obj1.show();
		obj1.print();
	}
}
