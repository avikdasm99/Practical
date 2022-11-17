package lamdaFunc;
import java.util.*;
public class Lamda1 {

	public static void main(String[] args) {
	LinkedList<String> fruit=new LinkedList<String>();
	Collections.addAll(fruit,"apple","mango","banana");
	fruit.forEach((n) ->{System.out.println(n);});
	}
}
