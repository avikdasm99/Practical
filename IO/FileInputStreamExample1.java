package IO;
import java.io.*;
public class FileInputStreamExample1 {

	public static void main(String[] args) {
		try {
			FileInputStream obj=new FileInputStream("D:\\hellow.txt");
			int i= obj.read();	
			obj.close();
			System.out.println((char)i);
			}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
