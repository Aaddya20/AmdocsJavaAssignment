package day1;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDetails sd1 = new StudentDetails("Puja", 21, 101, 78);
		StudentDetails sd2 = new StudentDetails("Sam", 24, 105, 81);
		StudentDetails sd3 = new StudentDetails("Aditi", 19, 121, 15);
		StudentDetails sd4 = new StudentDetails("Nidhi", 28, 110, 30);
		StudentDetails sd5 = new StudentDetails("Nupur", 17, 103, 24);
		if(sd1.getMarks()<30)
			System.out.println(sd1.getName()+" - Marks less than 30 cannot be accepted.");
		if(sd2.getMarks()<30)
			System.out.println(sd2.getName()+" - Marks less than 30 cannot be accepted.");
		if(sd3.getMarks()<30)
			System.out.println(sd3.getName()+" - Marks less than 30 cannot be accepted.");
		if(sd4.getMarks()<30)
			System.out.println(sd4.getName()+" - Marks less than 30 cannot be accepted.");
		if(sd5.getMarks()<30)
			System.out.println(sd5.getName()+" - Marks less than 30 cannot be accepted.");
	}

}