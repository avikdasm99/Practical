package lamdaFunc;
interface MyInterface1{
	String name(); 
}
public class NoParameter {
	public static void main(String[] args) {
		MyInterface1 n1=()->{ return ("Avik das");};
		System.out.println(n1.name());
	}
	
}
