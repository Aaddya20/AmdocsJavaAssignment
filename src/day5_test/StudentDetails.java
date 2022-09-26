package day5_test;

public class StudentDetails {

	private int enrollment_id;
	private String name;
	private String course_name;
	private int course_id;
	
	public StudentDetails(int enrollment_id, String name, String course_name, int course_id) {
		super();
		this.enrollment_id = enrollment_id;
		this.name = name;
		this.course_name = course_name;
		this.course_id = course_id;
	}

	public int getEnrollment_id() {
		return enrollment_id;
	}

	public void setEnrollment_id(int enrollment_id) {
		this.enrollment_id = enrollment_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	@Override
	public String toString() {
		return "StudentDetails [enrollment_id=" + enrollment_id + ", name=" + name + ", course_name=" + course_name
				+ ", course_id=" + course_id + "]";
	}
	
}
