package lamdaFunc;
interface MyInterface2{
	int num(int a);
}
public class SinglePrameter {

	public static void main(String[] args) {
		
		MyInterface2 method1=(int a)->{return ++a; };
		System.out.println(method1.num(2));
	}
}
