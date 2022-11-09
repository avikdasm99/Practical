package IO;
import java.io.*;
public class BufferedInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream onj=new FileInputStream("D:\\hellow.txt");
			BufferedInputStream obj=new BufferedInputStream(onj);
			int i;
			while((i=obj.read())!=-1) {
				System.out.print((char)i);
			}
			System.out.println("\ndone");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
