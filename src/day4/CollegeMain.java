package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudentDetails> students =new ArrayList<>();
		students.add(new StudentDetails("Neha","101","Patna Womens College",25));
		students.add(new StudentDetails("Nidhi","132","St. Xavier",24));
		students.add(new StudentDetails("Shreya","121","Ranchi University",21));
		students.add(new StudentDetails("Alisha","108","Patna Womens College",26));
		Collections.sort(students,new CollegeComparator());
		System.out.println("Students Details---");
		for(StudentDetails std:students)
		{
			if(std.getCollege()=="Patna Womens College")
			System.out.println(std.toString());
		}
	}

}
