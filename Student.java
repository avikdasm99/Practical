package StringBuffer;

public class Student {
 int n;
 String name;
 String  city;
 Student(int n, String name,String  city){
	 this.n=n;
	 this.name=name;
	 this.city=city;	 
 }
   public String toString() {
	 return (n+" "+name+" "+city); 
 }
	public static void main(String[] args) {
		Student s = new Student(1,"ram","kolkata");
		Student s1 = new Student(2,"sam","howrah");
		System.out.println(s);
		System.out.println(s1);
	}
}
