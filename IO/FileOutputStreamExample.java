package IO;
import java.io.*;
public class FileOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream obj=new FileOutputStream("D:\\hellow.txt");
			obj.write(65);
			obj.close();
			System.out.println("done");	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
