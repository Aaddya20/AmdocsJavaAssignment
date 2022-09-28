package day8;

public class WithdrawSync {


	int p=10000;
	synchronized void shareMethod(int arg)
	{
		if(arg<=p)
		{
			p=p-arg;
			System.out.println("Withdraw Amount: "+ arg);
			System.out.println("Remaining Amount: "+ p);
		}
			try
			{	
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted: ");
			}
			
	}
}
