package OOP_Concept;

class ObjMethod2 {                                                     //create class
  int age;
   String name;
   void input(int a,String n) {
	  age=a;
	  name=n;
	}
   void display() {
		System.out.println(age+"  "+name);
   }
}
public class ObjMethod1{                                             //create another class
	public static void main(String ...args) {                         //main method
	
		ObjMethod2  obj1=new ObjMethod2();              //creating object
		ObjMethod2  obj2=new ObjMethod2();               //creating  another object
		obj1.input(12,"Avik");                                 //initialized object by reference
		obj2.input(11,"Das");
		
		obj1.display();  
		obj2.display();
	}
}