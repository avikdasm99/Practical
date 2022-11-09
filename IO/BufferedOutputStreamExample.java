package IO;
import java.io.*;
public class BufferedOutputStreamExample {

	public static void main(String[] args){
		try {
			FileOutputStream obj=new FileOutputStream("D:\\hellow.txt");
			BufferedOutputStream obj1=new BufferedOutputStream(obj);
			String s="My name is Avik das";
			byte b[]=s.getBytes();
			obj1.write(b);
			obj1.flush();  //It flushes the buffered output stream.
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
