package OOP_Concept;

class ObjRef1 {
	int age;
	String name;
}
public class objRef{
	public static void main(String ...args) {
		ObjRef1 obj=new ObjRef1();
		ObjRef1 obj1=new ObjRef1();
		obj.age=50;
		obj.name="Avik";
		obj1.age=30;
		obj1.name="Abc";
System.out.println(obj.age+"  "+obj.name);
System.out.println(obj1.age+"  "+obj1.name);
	}
}