package lamdaFunc;
interface MyInterface3{
	String sentence(String s1,String s2,String s3,String s4,String s5);
}
public class MultipleParameter {

	public static void main(String[] args) {
		MyInterface3 method=(String s1,String s2,String s3,String s4,String s5)->{ return s1+s2+s3+s4+s5;};
		System.out.println(method.sentence("MY ","NAME ", "IS ", "AVIK ", "DAS"));

	}

}
