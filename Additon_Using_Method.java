package OOP_Concept;
import java.util.Scanner;
public class Additon_Using_Method {

	public static void main(String[] args) {
	
Scanner obj=new Scanner(System.in);
System.out.print("enter 1st number=");
int a=obj.nextInt();
System.out.print("enter 2nd number=");
int b=obj.nextInt();
int result=a+b;
add(result);   // user defined method
	}
	public static void add(int result) {
		System.out.println("the addition="+result);
	}

}
