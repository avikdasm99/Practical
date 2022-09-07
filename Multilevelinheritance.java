package sep7;

class Veicle12 {   
void run1() {
	System.out.println("Running mode is on");
       }
}
class Bike1 extends Veicle12{
	void run2(){
		System.out.println("Bike run mode is on");
	}
}
class Car extends Bike1{
	void run3(){
		System.out.println("Speed is very high");
	}
}

public class Multilevelinheritance {
    public static void main(String[] args) {
    	Car obj=new Car();
    	obj.run1();
    	obj.run2();
    	obj.run3();
	}
}
