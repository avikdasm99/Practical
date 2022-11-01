package thr;

public class Thread7 implements Runnable {
	Thread t1= new Thread();
	
    public void run() {
	System.out.println(t1.toString());
     }
	public static void main(String[] args) {
		Runnable r=new Thread7();

        System.out.println(r.getClass());
	}

}
