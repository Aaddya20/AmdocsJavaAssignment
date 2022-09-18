package day1;

import java.util.Arrays;
import java.util.Comparator;

class EmployeeDetails {
	String name;
	int year;
	
	EmployeeDetails(String name, int year)
	{
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", year=" + year + "]";
	}

	public int compareTo(EmployeeDetails o) {
		if(this.year != o.getYear()) {
			return this.year - o.getYear();
			}
		return this.name.compareTo(o.getName());
	}
}

class SortByYear implements Comparator<EmployeeDetails> {
	
	public int compare(EmployeeDetails a, EmployeeDetails b)
	{
		return a.year - b.year;
	}
}

public class EmployeeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails[] Emp = {new EmployeeDetails("Tom",14),new EmployeeDetails("Sam",9),new EmployeeDetails("Rohini",25),new EmployeeDetails("Neha",34),new EmployeeDetails("Puja",12)};
		System.out.println("Before Sorting: -");
		System.out.println(Arrays.toString(Emp));
		System.out.println("After Sorting: -");
		Arrays.sort(Emp, new SortByYear());
		System.out.println(Arrays.toString(Emp));
	}
}