package day9;

import java.util.ArrayList;
import java.util.List;

public class Student_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list=new ArrayList<Student>();
		list.add(new Student("Aaddya",96,"A"));
		list.add(new Student("Payal",40,"B"));
		list.add(new Student("Shreya",80,"A"));
		list.add(new Student("Nupur",77,"A"));
		list.add(new Student("Suman",33,"C"));
		
		list.stream().filter(n->n.getGrade().charAt(0)=='A').sorted((Student o1, Student o2) -> 
		o1.getName().compareTo(o2.getName())).forEach(x->System.out.println(x.getName()));
		
	}

}
