package thr;

public class Thread4 implements Runnable {
public void run() {
	System.out.println("thread activated");
}
	public static void main(String[] args) {
		Runnable r= new Thread4();
		Thread t=new Thread(r,"Avik");
        System.out.println("Thread name = "+t.getName());
        System.out.println("Thread priority = "+t.getPriority());
        System.out.println("Thread state = "+t.getState());
        t.start();
        System.out.println("Thread state = "+t.getState());
        System.out.println("Thread id = "+t.getId());
        System.out.println("Thread sta = "+t.currentThread());
        
        System.out.println(t.currentThread().getName().getClass());
        System.out.println(t.isAlive());
  }
}
