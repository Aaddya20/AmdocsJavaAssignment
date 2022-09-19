package day2;

public class SumAvg {

	int a,b,c,d, sum=0;
	double avg = 0.0;
	
	void func(int a, int b)
	{
		System.out.println("1st Method---");
		sum = a + b;
		avg = sum/2;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}
	
	void func(int a, int b, int c)
	{
		System.out.println("2nd Method---");
		sum = a + b + c;
		avg = sum/3;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}
	
	void func(int a, int b, int c, int d)
	{
		System.out.println("3rd Method---");
		sum = a + b + c + d;
		avg = sum/4;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}
	
}
