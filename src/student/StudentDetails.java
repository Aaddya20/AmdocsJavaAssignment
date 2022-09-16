package student;

public class StudentDetails {

	String name;
	int age;
	int roll_no;
	int marks;
	
	public StudentDetails(String name, int age, int roll_no, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.roll_no = roll_no;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
			this.marks = marks;
	}
	

}
