package day4;

import java.util.Comparator;

public class CollegeComparator implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		return o1.getCollege().compareTo(o2.getCollege());
	}

}
