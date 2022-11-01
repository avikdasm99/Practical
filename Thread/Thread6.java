package thr;

public class Thread6 extends Thread {
public void run() {
	for(int i=0;i<3;i++) {
		try {
			Thread.sleep(5000);
			System.out.println("currentThread :"+Thread.currentThread().getName());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(i);

	}
}
	public static void main(String[] args) {
		// creating 3 threads  
		Thread6 t1=new Thread6();
		Thread6 t2=new Thread6();
		Thread6 t3=new Thread6();
		t1.start(); 
		try {
			System.out.println("currentThread :"+Thread.currentThread().getName());
			t1.join(5000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t2.start(); 
	
		try {
			System.out.println("currentThread :"+Thread.currentThread().getName());
			t2.join(5000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t3.start();
		
	}

}
