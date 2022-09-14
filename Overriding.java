package practical;

class Vehicle{ 
	  void run(){System.out.println("Vehicle is running");
	  }  
	}  
	
	public class Overriding extends Vehicle{  
	  void run(){System.out.println("Bike is running safely");}  
	  public static void main(String args[]){  
		  Overriding obj = new Overriding(); 
	  obj.run(); 
	  }  
	}  