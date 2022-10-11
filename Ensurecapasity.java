package StringBuffer;

public class Ensurecapasity {

	public static void main(String[] args) {
		
		StringBuffer s= new StringBuffer();

	      System.out.println(s.capacity());
	      s.append("avik");
	      s.ensureCapacity(30);
	      s.append("avik das");
	      System.out.println(s.capacity());
	      s.append("avik das");
	      System.out.println(s.capacity());
	      s.append("avik das");
	      System.out.println(s.capacity());
	}
}
