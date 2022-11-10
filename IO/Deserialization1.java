package serializ;
import java.io.*;
public class Deserialization1 {

	public static void main(String[] args) {
		try {
			ObjectInputStream on=new ObjectInputStream(new FileInputStream("D:\\Serialization1.txt"));
			Student s=(Student)on.readObject();
			System.out.println(s.id+" "+s.name+" "+s.fees);
			on.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
