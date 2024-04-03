package Exceptionhandling;

	

public class multitasking extends Thread
{
	
public  void run() {
		
		
		System.out.println("override...."+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multitasking t1 = new multitasking();
		t1.setName("thread t1");
		t1.run();
		multitasking t2 = new multitasking();
		t2.setName("thread t");
		t2.start();
	}

}
