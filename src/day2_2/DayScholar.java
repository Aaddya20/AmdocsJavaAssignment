package day2_2;

public class DayScholar extends Student {

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
	
	public DayScholar(int reg_no, String dept) {
		super();
		this.reg_no = reg_no;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "DayScholar [reg_no=" + reg_no + ", dept=" + dept + "]";
	}
	

}
