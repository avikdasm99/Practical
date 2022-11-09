package IO;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStream1 {

	public static void main(String[] args) {
		
		try {
			byte[] arr= {65,66,67,68,69,70};
			ByteArrayInputStream p1=new ByteArrayInputStream(arr);
			int i=0;
			while((i=p1.read())!=-1) {
				System.out.println((char)i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
