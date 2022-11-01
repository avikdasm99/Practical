package thr;

public class Thread8  extends Thread{
public void run() {
	System.out.println(Thread.currentThread().getName());
	
}
	public static void main(String[] args) {
		Thread8 t1= new Thread8();
		Thread8 t2= new Thread8();
		t1.start();
		System.out.println(t1.getState());
		try {
			t1.sleep(6000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		
		try {
			t2.join(6888);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(t2.getState());
	}
}
