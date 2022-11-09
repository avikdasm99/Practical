package IO;
import java.io.*;
public class FileOutputStreamExample2 {

	public static void main(String[] args) {
		try {
			FileOutputStream obj=new FileOutputStream("D:\\hellow.txt");
			String s= "welcome to java";
			byte b[]=s.getBytes();//converting string into byte array
			obj.write(b);
			obj.close();
			System.out.println("done");
		}
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
