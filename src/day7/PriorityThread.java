package day7;

public class PriorityThread extends Thread{

	private String name;
	Thread t;
	
	PriorityThread(String name, int priority) {
		super(name);
		this.name=name;
		setPriority(priority);
		t=new Thread(this,"thread 1");
		
		System.out.println(this.name + " is Created.");
		t.start();
	}
	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println(this.name + " is Running..");
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name + " is Finished..");
	}
	
}
