package thr;

public class Thread5 extends Thread {
public void run() {
	for(int i=0;i<6;i++) {
		try {
			Thread.sleep(8000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		Thread5 t1=new Thread5();
		Thread5 t2=new Thread5();
		Thread5 t3=new Thread5();
		t3.setPriority(MAX_PRIORITY);
		System.out.println(t3.getState());
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t3.getState());
		
	}
}
