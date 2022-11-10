package serializ;
import java.io.*;
class Student implements Serializable{
	int id;
	String name;
	int fees;
	public Student(int id,String name,int fees) {
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
}
public class Serialization1 {
   public static void main(String[] args) {
	try {
		Student s=new Student(1997,"Avik Das",1104);
		FileOutputStream f1=new FileOutputStream("D:\\Serialization1.txt");
		ObjectOutputStream f2= new ObjectOutputStream(f1);
		f2.writeObject(s);
		f2.close();
		System.out.println("done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
   }
}
