package practical;

class Computer{ 
	  int run(){
	  return 10;
	  }  
	}  
class Math extends Computer{ 
	  int run(){
	  return 20;
	  }  
	}  
class Science extends Computer{ 
	  int run(){
	  return 30;
	  }  
	}  
	
public class Overriding2 extends Computer{  
	
	int run(){
		  return 40;
		  }  
	  public static void main(String args[]) {  
		  Computer obj1 = new Computer(); 
		  Math obj2 = new Math(); 
		  Science obj3 = new Science(); 
		  Overriding2 obj4 = new Overriding2(); 
		  
		  System.out.println("Math Marks is   "+obj2.run());
		  System.out.println("Science Marks is   "+obj3.run());
		  System.out.println("Overriding2 Marks is   "+obj4.run());
	 
	  }  
	}  