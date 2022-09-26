package day5_test;

public class Contact {

	String name;
	long mobileNum;

	public Contact(String name, long mobileNum) {
		super();
		this.name = name;
		this.mobileNum = mobileNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobileNum=" + mobileNum + "]";
	}
	
}
