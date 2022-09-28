package day8;

public class Chef implements Runnable {

	Thread t;
	Waiter q;
	public Chef(Waiter q)
	{
		this.q=q;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<8)
		{
			q.putPrepared(i++);
		}
		
	}

}
