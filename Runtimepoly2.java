package practical;
class Zoo1{
	int a=10;
	void bark() {
		System.out.println("barking");
	}
}
class Cat extends Zoo1{
	final int a=20;
	void bark() {
		System.out.println("meao");
	}
}
class Dog extends Zoo1{
	void bark() {
		System.out.println("baff");
	}
}
public class Runtimepoly2 {

	public static void main(String[] args) {
		Zoo1 z;
		z=new Cat();
		z.bark();
		System.out.println(z.a);
		z=new Dog();
		z.bark();
		}
}
