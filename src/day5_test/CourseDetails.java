package day5_test;

public class CourseDetails {

	private String course_name;
	private int course_id;
	private int course_fee;
	
	public CourseDetails(String course_name, int course_id, int course_fee) {
		super();
		this.course_name = course_name;
		this.course_id = course_id;
		this.course_fee = course_fee;
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

	public int getCourse_fee() {
		return course_fee;
	}

	public void setCourse_fee(int course_fee) {
		this.course_fee = course_fee;
	}

	@Override
	public String toString() {
		return "CourseDetails [course_name=" + course_name + ", course_id=" + course_id + ", course_fee=" + course_fee
				+ "]";
	}
	
}
