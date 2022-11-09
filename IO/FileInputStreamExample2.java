package IO;
import java.io.*;
public class FileInputStreamExample2 {

	public static void main(String[] args) {
		try {
			FileInputStream obj=new FileInputStream("D:\\hellow.txt");
			int i=0;
			while((i=obj.read())!=-1){
				System.out.print((char)i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
