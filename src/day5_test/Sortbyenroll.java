package day5_test;

import java.util.Comparator;

public class Sortbyenroll implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		// TODO Auto-generated method stub
		
		return o1.getEnrollment_id() - o2.getEnrollment_id();
	}

}
