package thr;

public class Thread1 extends Thread{
	public void run() {
		System.out.println("thread activated");
	}
     public static void main(String[] args) {
	Thread1 obj= new Thread1();
	obj.start();
	System.out.println(obj.getId());
  }
}
