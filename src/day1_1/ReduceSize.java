package day1_1;

public class ReduceSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbbbeeeeffggg";
		int c=1;
		System.out.print(str.charAt(0));
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
				c++;
			else
			{
				System.out.print(c);
				System.out.print(str.charAt(i+1));
				c = 1;
			}
		}
		System.out.print(c);
	}

}
