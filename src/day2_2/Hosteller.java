package day2_2;

public class Hosteller extends Student {

	int hostel_no;
	int room_no;
	int reg_no;
	String dept;
	
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getHostel_no() {
		return hostel_no;
	}
	public void setHostel_no(int hostel_no) {
		this.hostel_no = hostel_no;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	
	public Hosteller(int hostel_no, int room_no, int reg_no, String dept) {
		super();
		this.hostel_no = hostel_no;
		this.room_no = room_no;
		this.reg_no = reg_no;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Hosteller [hostel_no=" + hostel_no + ", room_no=" + room_no + ", reg_no=" + reg_no + ", dept=" + dept
				+ "]";
	}
	
}
