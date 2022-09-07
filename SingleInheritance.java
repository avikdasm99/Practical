package sep7;

class Veicle1 {
void run1() {
	System.out.println("Running mode is on");
       }
}

class Bike extends Veicle1{
	void run2(){
		System.out.println("Bike run mode is on");
	}
}

public class SingleInheritance{
	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.run2();
	}
}

