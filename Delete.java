package StringBuffer;

public class Delete {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("avik");
		s.delete(0, 1);
		s.deleteCharAt(1);
		System.out.println(s);

	}

}
