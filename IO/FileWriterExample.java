package IO;
import java.io.*;
public class FileWriterExample {
public static void main(String[] args) {
	try {
		FileWriter f1=new FileWriter("D:\\hellow.txt");
		f1.write("Welcome to python");
		System.out.println("done");
		f1.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}
