package rough;

class Person{
	private int age;                   // private field
	
	int getage() {                      // getter methods 
		return age;
	}
	void setage(int age) {           // setter methods
		this.age=age;
	}
}


public class Encapsulation2 {

	public static void main(String[] args) {
		Person p=new Person();                      // create an object of Person
		p.setage(21);                                        // change age using setter
		p.setage(34);
		System.out.println("age= "+p.getage());     // access age using getter
	}
}
