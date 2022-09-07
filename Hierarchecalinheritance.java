package sep7;
class Veicles {   
void run1() {
	System.out.println("Running mode is on");
       }
}
class Bikes extends Veicles{
	void run2(){
		System.out.println("Bike run mode is on");
	}
}
class Cars extends Veicles {
	void run3(){
		System.out.println("Speed is very high");
	}
}

public class Hierarchecalinheritance {

	public static void main(String[] args) {
		    	Cars obj=new Cars();
		    	obj.run1();
		    	obj.run3();
	}
}
