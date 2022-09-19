package practical;

 interface M2 {         // 1st interface
void run();
}
 
 interface M3 {       // 2nd  interface
void work();
 }
 public class MultipleInheritance implements M2,M3{
	 public void run() {                  
		System.out.println("implement the method of M2 interface");    
	 }
	 public void work() {             
			System.out.println(" implement the method of M3 interface"); 
		 }
	 public static void main(String[] args) {
		 MultipleInheritance m=new MultipleInheritance();
		m.run();
		m.work();
		
	}
 }
  