package IO;
import java.io.*;
public class ByteArrayOutputStream1 {

	public static void main(String[] args) {
	try {
		FileOutputStream p1=new FileOutputStream("D:\\F1.txt");
		FileOutputStream p2=new FileOutputStream("D:\\F2.txt");
		ByteArrayOutputStream p3=new ByteArrayOutputStream();   
		p3.write(67);
		p3.writeTo(p1);
		p3.writeTo(p2);
		System.out.println("done ");
	}
	catch(Exception e) {
		System.out.println(e);
	}

	}

}
