package day8;

public class WithdrawThread  implements Runnable{

	int arg;
	WithdrawSync obj;
	Thread t;
	public WithdrawThread(int arg, WithdrawSync obj) {
		super();
		this.arg = arg;
		this.obj = obj;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.shareMethod(arg);
		
	}
}
