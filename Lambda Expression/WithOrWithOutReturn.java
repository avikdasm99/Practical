package lamdaFunc;

interface Add{
	int add(int a,int b);
}
public class WithOrWithOutReturn {

	public static void main(String[] args) {
		// void type
		Add method1=(int a,int b)->(a+b);
		System.out.println(method1.add(2, 3));
		// return type
		Add method2=(int a,int b)->{ return a+b;};
		System.out.println(method2.add(6, 8));

	}

}
