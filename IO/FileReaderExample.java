package IO;
import java.io.*;
public class FileReaderExample {
	public static void main(String args[])throws Exception{ 
		try {
			FileReader fr=new FileReader("D:\\hellow.txt");    
	        int i;    
	        while((i=fr.read())!=-1)    
	        System.out.print((char)i);    
	        fr.close();  	
		}
		catch(Exception e) {
			System.out.println(e);
		}
          
  }    
}
