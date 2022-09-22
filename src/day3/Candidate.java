package day3;

public class Candidate {

	String name;
	String gender;
	double expectedSalary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExectedSalary(double expectedSalary) {
		try {
			if(expectedSalary<10000)
				throw new InvalidSalaryException("Salary cannot be less than 10000.");
			else
				this.expectedSalary = expectedSalary;
		}
		catch (InvalidSalaryException ise){
			System.out.println(ise.getMessage());
		}
	}
	
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", gender=" + gender + ", expectedSalary=" + expectedSalary + "]";
	}
	
}
