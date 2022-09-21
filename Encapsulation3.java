package rough;

class Account{
	
	private long acc_no;
	private String name;
	private double amount;
	
	long getacc_no() {                                     //getter method of acc_no
		return acc_no;
	}
	void setacc_no(long acc_no) {                 //setter method of acc_no
		this.acc_no=acc_no;
	}
	
	String getname() {                                 //getter method of name
		return name;
	}
	void setname(String name) {               //setter method of name
		this.name=name;
	}
	double getamount() {                              //getter method of amount
		return amount;
	}
	void setamount(double amount) {         //getter method of amount
		this.amount=amount;
	}
	
}


public class Encapsulation3 {

	public static void main(String[] args) {
		Account a=new Account();               //create object of Account 
      //setting variables to setter methods
		a.setacc_no(628941790);                                        // change acc_no  using setter
		a.setname("AVIK DAS");                                        // change name  using setter
		a.setamount(1000_0000);                                       // change amount  using setter
		System.out.println("A/c no : "+a.getacc_no());
		System.out.println("Name : "+a.getname());
		System.out.println("Amount : "+a.getamount());
	}
}
