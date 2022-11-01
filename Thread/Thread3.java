package thr;

public class Thread3 extends Thread {

	public static void main(String[] args) {
		Thread obj = new Thread("Avik"); // using constructor Thread(String)
        System.out.println(obj.getName()); // print Thread name
	}
}
