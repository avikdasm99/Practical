package practical;

interface   School{
	void show();
}

class Inter implements School{
	public void show(){
		System.out.println("display");
	}
}
class Inter2 implements School{
		public void show(){
			System.out.println("Interface");
		}
}

public class Interface1{
		public static void main(String[] args) {
			School s= new Inter2();
			s.show();
			
	}
}
		